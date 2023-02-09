package com.chatGptTest.chatGpt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * FOR CLARITY’S SAKE NOT NECESSARILY CALLING SINCE WE NOT TALKING TO DATABASE
 * we talking to the dtos
 */
@Data
public class Require {

    private String model;

    private String prompt;
    private Integer temperature;
    private Integer maxTokens;
    private Double topP;

}
