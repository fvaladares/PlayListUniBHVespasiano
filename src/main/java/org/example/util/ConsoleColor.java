package org.example.util;

public enum ConsoleColor {
    // Reset
    RESET("\u001B[0m"),

    // Regular Colors
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),

    // Background Colors
    RED_BACKGROUND("\u001B[41m"),
    GREEN_BACKGROUND("\u001B[42m"),

    // Bold/Bright Colors (Notice the "1;")
    BOLD("\u001B[1m"), // Pure bold (keeps current text color)
    BOLD_RED("\u001B[1;31m"),
    BOLD_GREEN("\u001B[1;32m"),
    BOLD_BLUE("\u001B[1;34m"),
    BOLD_YELLOW("\u001B[1;33m");

    private final String code;

    // Constructor
    ConsoleColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
