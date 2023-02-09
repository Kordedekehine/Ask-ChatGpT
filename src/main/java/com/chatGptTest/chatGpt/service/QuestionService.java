package com.chatGptTest.chatGpt.service;

import com.chatGptTest.chatGpt.dtos.QuestionRequestDto;
import com.chatGptTest.chatGpt.dtos.RequireResponseDto;

public interface QuestionService {

    RequireResponseDto askQuestion(QuestionRequestDto questionRequestDto);
}
