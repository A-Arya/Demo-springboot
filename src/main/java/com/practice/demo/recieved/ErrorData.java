package com.practice.demo.recieved;

public class ErrorData {
    private String category;
    private String message;

    public String getCategory() {
        return category;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorData{" +
                "category='" + category + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
