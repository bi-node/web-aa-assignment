package com.binode.lab4.aspect;

import com.binode.lab4.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ExceptionLoggingAspect {

    @Autowired
    LoggerService loggerService;

    @AfterThrowing(pointcut = "execution(* com.binode.lab4..*(..))", throwing = "exception")
    public void logException(Throwable exception) {
        String operation = "Method " + exception.getStackTrace()[0].getMethodName() + " threw an exception";
        loggerService.logException(operation, exception.getClass().getSimpleName());
    }
}



