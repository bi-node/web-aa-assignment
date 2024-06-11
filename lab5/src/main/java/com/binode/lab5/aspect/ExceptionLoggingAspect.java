package com.binode.lab5.aspect;

import com.binode.lab5.service.LoggerService;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ExceptionLoggingAspect {

    @Autowired
    LoggerService loggerService;

    @AfterThrowing(pointcut = "execution(* com.binode.lab5..*(..))", throwing = "exception")
    public void logException(Throwable exception) {
        String operation = "Method " + exception.getStackTrace()[0].getMethodName() + " threw an exception";
        loggerService.logException(operation, exception.getClass().getSimpleName());
    }
}



