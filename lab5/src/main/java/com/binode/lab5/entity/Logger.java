package com.binode.lab5.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="logger")
public class Logger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;

    private LocalDate date;
    private LocalTime time;
    private String principle;
    private String operation;

    public Logger(Long transactionId, LocalDate date, LocalTime time, String principle, String operation) {
        this.transactionId = transactionId;
        this.date = date;
        this.time = time;
        this.principle = principle;
        this.operation = operation;
    }
    public Logger() {}

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
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

    // Getters and setters
}
