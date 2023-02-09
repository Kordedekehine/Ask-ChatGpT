package com.chatGptTest.chatGpt.controller;

import com.chatGptTest.chatGpt.ChatGptRoutes;
import com.chatGptTest.chatGpt.dtos.QuestionRequestDto;
import com.chatGptTest.chatGpt.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ChatGptRoutes.ChatGpt_Api)
@Slf4j
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping(ChatGptRoutes.ASK)
    public ResponseEntity<?> askQuestion(@RequestBody QuestionRequestDto questionRequestDto){
        log.info(questionRequestDto.toString());
        try {
           return new ResponseEntity<>(questionService.askQuestion(questionRequestDto), HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
