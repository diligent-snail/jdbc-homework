package ru.hse.jdbctask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:derby:memory:sample;create=true")) {
            System.out.println("Соединение установлено");
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
