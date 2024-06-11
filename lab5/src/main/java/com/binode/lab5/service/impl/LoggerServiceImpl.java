package com.binode.lab5.service.impl;

import com.binode.lab5.entity.Exception;
import com.binode.lab5.entity.Logger;
import com.binode.lab5.repository.ExceptionRepository;
import com.binode.lab5.repository.LoggerRepository;
import com.binode.lab5.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class LoggerServiceImpl implements LoggerService {

    private final LoggerRepository loggerRepository;
    private final ExceptionRepository exceptionRepository;

    @Autowired
    public LoggerServiceImpl(LoggerRepository loggerRepository, ExceptionRepository exceptionRepository) {
        this.loggerRepository = loggerRepository;
        this.exceptionRepository = exceptionRepository;
    }

    @Override
    public void logOperation(String  operation) {
        Logger logEntry = new Logger();
        logEntry.setDate(LocalDate.now());
        logEntry.setTime(LocalTime.now());
        logEntry.setPrinciple("StaticUser");
        logEntry.setOperation(operation);
        loggerRepository.save(logEntry);
    }

    @Override
    public void logException(String operation, String exceptionType) {
        Exception logException = new Exception();
        logException.setDate(LocalDate.now());
        logException.setTime(LocalTime.now());
        logException.setPrinciple("StaticUser");
        logException.setOperation(operation);
        logException.setExceptionType(exceptionType);

        exceptionRepository.save(logException);


    }

}
