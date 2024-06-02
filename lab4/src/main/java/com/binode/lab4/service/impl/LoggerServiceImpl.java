package com.binode.lab4.service.impl;

import com.binode.lab4.model.Logger;
import com.binode.lab4.repository.LoggerRepository;
import com.binode.lab4.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    private final LoggerRepository loggerRepository;

    @Autowired
    public LoggerServiceImpl(LoggerRepository loggerRepository) {
        this.loggerRepository = loggerRepository;
    }

    @Override
    public void logOperation(String transactionId, String dateTime, String principle, String operation) {
        Logger logger = new Logger(transactionId, dateTime, principle, operation);
        loggerRepository.save(logger);
    }
}
