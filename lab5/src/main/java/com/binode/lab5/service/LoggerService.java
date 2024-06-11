package com.binode.lab4.service;

import java.time.LocalDateTime;

public interface LoggerService {


    void logOperation(String operation);
    void logException(String operation, String exceptionType);

}
