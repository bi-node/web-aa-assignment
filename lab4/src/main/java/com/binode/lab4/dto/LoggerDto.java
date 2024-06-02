package com.binode.lab4.dto;

import java.time.LocalDateTime;

public class LoggerDto {
    private long id;
    private LocalDateTime datetime;
    private String principle;
    private String operation;

    public LoggerDto() {
    }

    public LoggerDto(LocalDateTime datetime, String principle, String operation) {
        this.datetime = datetime;
        this.principle = principle;
        this.operation = operation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
