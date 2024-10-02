package org.example;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Account implements AccountService {
    private int balance=0;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    @Override
    public void deposit(int amount) {
        balance += amount;
        //create a new transaction
        Transaction transaction = new Transaction(String.valueOf(amount), LocalDate.now().atStartOfDay(), balance);
        transactions.add(transaction);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        //create a new transaction
        Transaction transaction = new Transaction("-"+ amount, LocalDate.now().atStartOfDay(), balance);
        transactions.add(transaction);
    }

    @Override
    public void printStatement() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date    || Amount || Balance");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.date().format(formatter) + " || " + transaction.amount() + " || " + transaction.balance());
        }
    }
    //getter et setter
    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
