package ru.hse.jdbctask;

public record Post(
        Long id,
        String author,
        String text
) {
}
