package com.practice.demo.entity;

public class EventDetails {
    private String partnerId;
    private String conversationId;
    private String recordingId;

    public EventDetails(String partnerId, String conversationId, String recordingId) {
        this.partnerId = partnerId;
        this.conversationId = conversationId;
        this.recordingId = recordingId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public String getRecordingId() {
        return recordingId;
    }
}
