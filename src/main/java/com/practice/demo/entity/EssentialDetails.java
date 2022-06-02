package com.practice.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties
//to indicate that the properties that do not match json response should be ignored
public class EssentialDetails {

    List<String> traceStages;
    EventDetails eventDetails;
    EventState eventState;

    public EssentialDetails(List<String> traceStages, EventDetails eventDetails, EventState eventState) {
        this.traceStages = traceStages;
        this.eventDetails = eventDetails;
        this.eventState = eventState;
    }

    public void addTraceStages(String name) {
        traceStages.add(name);
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    public void setEventState(EventState eventState) {
        this.eventState = eventState;
    }

    public List<String> getTraceStages() {
        return traceStages;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public EventState getEventState() {
        return eventState;
    }

}
