package com.practice.demo.service;

import com.practice.demo.entity.EssentialDetails;
import com.practice.demo.entity.EventDetails;
import com.practice.demo.entity.EventState;
import com.practice.demo.recieved.CurrentStage;
import com.practice.demo.recieved.Details;
import com.practice.demo.recieved.Stages;
import com.practice.demo.recieved.WorkflowMetaData;
import org.json.JSONArray;
import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowServiceImpl implements WorkflowService{
//    private final RestTemplate restTemplate;
//
//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//
//    @Bean
//    public RestTemplateBuilder restTemplateBuilder() {
//
//        return new RestTemplateBuilder();
//    }

//    public WorkflowServiceImpl(@Lazy RestTemplateBuilder restTemplateBuilder) {
//        this.restTemplate = restTemplateBuilder.build();
//    }

//    private EssentialDetails parseData(String json){
//        List<String> traceStages = new ArrayList<>();
//        JSONObject root = new JSONObject(json);
//        JSONArray traceSt = root.getJSONArray("traceStages");
//
//        for(int i=0; i<traceSt.length(); i++){
//            JSONObject stage = traceSt.getJSONObject(i);
//            String name = stage.getString("name");
//            traceStages.add(name);
//        }
//        JSONObject current = root.getJSONObject("currentStage");
//        traceStages.add(current.getString("name"));
//
//        JSONObject workflowMetaData = root.getJSONObject("workflowMetaData");
//        String partnerId = workflowMetaData.getString("partner_id");
//        String conversationId = workflowMetaData.getString("conversation_id");
//        String recordingId = workflowMetaData.getString("recording_sid");
//
//        EventDetails eventDetails = new EventDetails(partnerId, conversationId, recordingId);
//
//        Boolean inError =  root.getBoolean("inError");
//        Boolean inSuccess = root.getBoolean("inSuccess");
//        Boolean inOpen = root.getBoolean("inOpen");
//
//        EventState eventState = new EventState(inError, inSuccess, inOpen);
//
//
//        return new EssentialDetails(traceStages, eventDetails, eventState);
//    }
//    @Override
//    public EssentialDetails getDetails(String response) { //String url
//        //String json =  restTemplate.getForObject(url, String.class);
//        return parseData(response);
//    }

    private EssentialDetails parseData(Details json){
        List<Stages> traceSt = json.getTraceStages();
        List<String> traceStages = new ArrayList<>();

        for(int i = 0; i<traceSt.size(); i++){
            Stages stage = traceSt.get(i);
            traceStages.add(stage.getName());
        }
        traceStages.add(json.getCurrentStage().getName());

        EventDetails eventDetails = new EventDetails(json.getWorkflowMetaData().getPartner_id(), json.getWorkflowMetaData().getConversation_id(), json.getWorkflowMetaData().getRecording_sid());

        EventState eventState = new EventState(json.getInError(), json.getInSuccess(), json.getInOpen());

        return new EssentialDetails(traceStages, eventDetails, eventState);
    }

    @Override
    public EssentialDetails getDetails(Details response) { //String url
        //String json =  restTemplate.getForObject(url, String.class);
        return parseData(response);
    }
}
