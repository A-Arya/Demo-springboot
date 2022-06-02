package com.practice.demo.recieved;

public class CurrentStage {
    private String name;
    private WorkflowState workflowState;
    private String startTime;
    private String endDateTime;
    private Boolean inEndStage;
    private Boolean inStartStage;
    private String processedMessageType;
    private String nextMessageTypes;

    public String getName() {
        return name;
    }

    public WorkflowState getWorkflowState() {
        return workflowState;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public Boolean getInEndStage() {
        return inEndStage;
    }

    public Boolean getInStartStage() {
        return inStartStage;
    }

    public String getProcessedMessageType() {
        return processedMessageType;
    }

    public String getNextMessageTypes() {
        return nextMessageTypes;
    }

    @Override
    public String toString() {
        return "CurrentStage{" +
                "name='" + name + '\'' +
                ", workflowState=" + workflowState +
                ", startTime='" + startTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", inEndStage=" + inEndStage +
                ", inStartStage=" + inStartStage +
                ", processedMessageType='" + processedMessageType + '\'' +
                ", nextMessageTypes='" + nextMessageTypes + '\'' +
                '}';
    }
}
