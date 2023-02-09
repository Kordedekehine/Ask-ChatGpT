package com.chatGptTest.chatGpt.dtos;

import com.chatGptTest.chatGpt.model.Choice;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class RequireResponseDto {

    private String id;
    private String object;
    private String model;
    private LocalDate created;
    private List<Choice> choices;
}
