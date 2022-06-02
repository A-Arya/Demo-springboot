package com.practice.demo.service;
import com.practice.demo.entity.EssentialDetails;
import com.practice.demo.entity.EventDetails;
import com.practice.demo.entity.EventState;
import com.practice.demo.recieved.Details;
import com.practice.demo.recieved.Stages;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowServiceImpl implements WorkflowService{

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
    public EssentialDetails getDetails(Details response) {
        return parseData(response);
    }
}
