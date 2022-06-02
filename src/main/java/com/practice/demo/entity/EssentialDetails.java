package com.practice.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
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
    //    private ArrayList traceStages;
//    private HashMap<String, Long> eventDetails;
//    private HashMap<String, Boolean> eventState;
//
//    public EssentialDetails(){
//        this.traceStages = new ArrayList();
//        this.eventDetails = new HashMap<String, Long>();
//        this.eventState = new HashMap<String, Boolean>();
//    }
//
//    public void addTraceStage(String traceStage) {
//        this.traceStages.add(traceStage);
//    }
//    public void addEventDetails(String key,Long value) {
//        this.eventDetails.put(key,value);
//    }
//    public void addEventState(String key, Boolean value){
//        this.eventState.put(key, value);
//    }
}
