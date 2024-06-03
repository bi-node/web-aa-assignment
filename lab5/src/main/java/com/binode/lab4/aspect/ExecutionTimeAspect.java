package com.binode.lab4.aspect;
import com.binode.lab4.service.LoggerService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class ExecutionTimeAspect {

    @Autowired
    private LoggerService loggerService;

    @Around("@annotation(ExecutionTime)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        String operation = joinPoint.getSignature().getName() + " executed in " + executionTime + "ms";
        //System.out.println(operation);

        loggerService.logOperation(operation);

        return proceed;
    }
}
