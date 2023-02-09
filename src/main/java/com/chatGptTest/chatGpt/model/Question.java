package com.chatGptTest.chatGpt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FOR CLARITY’S SAKE NOT NECESSARILY CALLING SINCE WE NOT TALKING TO DATABASE
 * we talking to the dtos
 */
@Data
@AllArgsConstructor
public class Question {

    private String message;
}
