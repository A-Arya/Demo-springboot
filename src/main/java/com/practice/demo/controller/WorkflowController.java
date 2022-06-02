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

//    @Value("${api.key}")
//    private String apiKey;

    @Autowired
    private WorkflowService workflowService;

    @GetMapping("/essentialDetails/{id}")
    public EssentialDetails getDetails(@PathVariable("id") String id){
        String url = "https://demo-link"+id;
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", "9642af2c-f7cd-43ad-9f1c-875ced41035a");
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Details> resp = restTemplate.exchange(url, HttpMethod.GET, entity, Details.class);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//
//        //String json = restTemplate.getForObject(url, String.class);
//        //return response;
//
//        String responseStr = response.getBody();
//        int begin = responseStr.indexOf("{");
//        int end = responseStr.lastIndexOf("}") + 1;
//        responseStr = responseStr.substring(begin, end);
        //Details response = restTemplate.getForObject(url, entity, Details.class);

        Details response = resp.getBody();

        return workflowService.getDetails(response);
    }
}


