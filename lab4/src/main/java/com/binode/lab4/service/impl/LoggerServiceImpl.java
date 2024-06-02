package com.binode.lab4.service.impl;

import com.binode.lab4.model.Logger;
import com.binode.lab4.repository.LoggerRepository;
import com.binode.lab4.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class LoggerServiceImpl implements LoggerService {

    private final LoggerRepository loggerRepository;

    @Autowired
    public LoggerServiceImpl(LoggerRepository loggerRepository) {
        this.loggerRepository = loggerRepository;
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
}
