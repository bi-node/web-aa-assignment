package com.binode.lab4.service;

import java.time.LocalDateTime;

public interface LoggerService {


    void logOperation(String transactionId, String dateTime, String principle, String operation);
}
