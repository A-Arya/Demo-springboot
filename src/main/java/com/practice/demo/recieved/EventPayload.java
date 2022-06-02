package com.practice.demo.recieved;

public class EventPayload {
    private String error;
    private String timestamp;
    private String payload;
    private String headers;
    private String publisher;

    public String getError() {
        return error;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPayload() {
        return payload;
    }

    public String getHeaders() {
        return headers;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "EventPayload{" +
                "error='" + error + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", payload='" + payload + '\'' +
                ", headers='" + headers + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
