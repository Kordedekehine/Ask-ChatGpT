package com.chatGptTest.chatGpt.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequireRequestDto {

    private String model;
    private String prompt;
    private Integer temperature;
    private Integer maxTokens;
    private Double topP;


}
