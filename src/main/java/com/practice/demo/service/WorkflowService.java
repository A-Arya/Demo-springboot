package com.practice.demo.service;

import com.practice.demo.entity.EssentialDetails;
import com.practice.demo.recieved.Details;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface WorkflowService {

    EssentialDetails getDetails(Details response);
}
