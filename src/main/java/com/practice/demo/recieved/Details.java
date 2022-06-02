package com.practice.demo.recieved;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Details {
    private String workflowId;
    private String workflowName;
    private String startDateTime;
    private String endDateTime;
    private String lastProcessedTime;
    private List<Stages> traceStages;
    private  CurrentStage currentStage;
    private WorkflowMetaData workflowMetaData;
    private Boolean inError;
    public Boolean inSuccess;
    private Boolean inOpen;
    private ErrorData error;


    public String getWorkflowName() {
        return workflowName;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public String getLastProcessedTime() {
        return lastProcessedTime;
    }

    public List<Stages> getTraceStages() {
        return traceStages;
    }

    public CurrentStage getCurrentStage() {
        return currentStage;
    }

    public WorkflowMetaData getWorkflowMetaData() {
        return workflowMetaData;
    }

    public Boolean getInError() {
        return inError;
    }


    public Boolean getInSuccess() {
        return inSuccess;
    }

    public Boolean getInOpen() {
        return inOpen;
    }

    public ErrorData getError() {
        return error;
    }

    @Override
    public String toString() {
        return "Details{" +
                "workflowId='" + workflowId + '\'' +
                ", workflowName='" + workflowName + '\'' +
                ", startDateTime='" + startDateTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                ", lastProcessedTime='" + lastProcessedTime + '\'' +
                ", traceStages=" + traceStages +
                ", currentStage=" + currentStage +
                ", workflowMetaData=" + workflowMetaData +
                ", inError=" + inError +
                ", inSuccess=" + inSuccess +
                ", inOpen=" + inOpen +
                ", error=" + error +
                '}';
    }
}


