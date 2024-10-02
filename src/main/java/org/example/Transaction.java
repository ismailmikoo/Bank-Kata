package org.example;

public record Transaction(String amount, java.time.LocalDateTime date, int balance) {
}
