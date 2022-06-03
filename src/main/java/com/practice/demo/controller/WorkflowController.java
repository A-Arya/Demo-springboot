package com.practice.demo.controller;
import com.practice.demo.entity.EssentialDetails;
import com.practice.demo.recieved.Details;
import com.practice.demo.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WorkflowController {

    @Autowired
    private WorkflowService workflowService;

    @GetMapping("/essentialDetails/{id}")
    public EssentialDetails getDetails(@PathVariable("id") String id){
        String url = "https://demo-url"+id;
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", "xyz");
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Details> resp = restTemplate.exchange(url, HttpMethod.GET, entity, Details.class);
        Details response = resp.getBody();

        return workflowService.getDetails(response);
    }
}


