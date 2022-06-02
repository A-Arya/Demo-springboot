package com.practice.demo.recieved;

public class WorkflowState {
    private String name;
    private String processedTime;
    private Boolean inErrorState;
    private EventPayload eventPayload;

    public String getName() {
        return name;
    }

    public String getProcessedTime() {
        return processedTime;
    }

    public Boolean getInErrorState() {
        return inErrorState;
    }

    public EventPayload getEventPayload() {
        return eventPayload;
    }
}
