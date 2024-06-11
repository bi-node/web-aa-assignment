package com.binode.lab5.service;

public interface LoggerService {


    void logOperation(String operation);
    void logException(String operation, String exceptionType);

}
