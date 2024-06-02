package com.binode.lab4.service.impl;

import com.binode.lab4.model.Logger;
import com.binode.lab4.repository.LoggerRepository;
import com.binode.lab4.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class LoggerServiceImpl implements LoggerService {

    LoggerRepository loggerRepository;

    public LoggerServiceImpl(LoggerRepository loggerRepository) {
        this.loggerRepository = loggerRepository;
    }

    private static final String STATIC_PRINCIPLE = "staticUser";

    @Override
    public void logOperation(String operation) {
        Logger logger = new Logger(LocalDateTime.now(), STATIC_PRINCIPLE, operation);
        loggerRepository.save(logger);


    }
}
