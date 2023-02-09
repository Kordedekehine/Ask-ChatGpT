package com.chatGptTest.chatGpt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * FOR CLARITY’S SAKE NOT NECESSARILY CALLING SINCE WE NOT TALKING TO DATABASE
 * we talking to the dtos
 */
@Data
public class Choice {

    private Integer index;
    private String text;
    @JsonProperty("finish_reason")
    private String finishReason;
}
