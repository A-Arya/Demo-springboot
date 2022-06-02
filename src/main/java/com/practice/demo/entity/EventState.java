package com.practice.demo.entity;

public class EventState {
    private Boolean inError;
    private Boolean inSuccess;
    private Boolean inOpen;

    public EventState(Boolean inError, Boolean inSuccess, Boolean inOpen) {
        this.inError = inError;
        this.inSuccess = inSuccess;
        this.inOpen = inOpen;
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

    public void setInError(Boolean inError) {
        this.inError = inError;
    }

    public void setInSuccess(Boolean inSuccess) {
        this.inSuccess = inSuccess;
    }

    public void setInOpen(Boolean inOpen) {
        this.inOpen = inOpen;
    }
}
