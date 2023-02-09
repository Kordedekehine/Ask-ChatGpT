package com.chatGptTest.chatGpt.service;

import com.chatGptTest.chatGpt.ChatGptRoutes;
import com.chatGptTest.chatGpt.dtos.QuestionRequestDto;
import com.chatGptTest.chatGpt.dtos.RequireRequestDto;
import com.chatGptTest.chatGpt.dtos.RequireResponseDto;
import com.chatGptTest.chatGpt.model.Question;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuestionServiceImpl implements QuestionService {

    public static RestTemplate restTemplate = new RestTemplate();

    public HttpEntity<RequireRequestDto> buildHttpEntity(RequireRequestDto requireRequestDto){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(ChatGptRoutes.MEDIA_TYPE));
        headers.add(ChatGptRoutes.AUTHORIZATION, ChatGptRoutes.BEARER + ChatGptRoutes.API_KEY);
        return new HttpEntity<>(requireRequestDto, headers);
    }

    public RequireResponseDto getResponse(HttpEntity<RequireRequestDto> requestDtoHttpEntity){
        ResponseEntity<RequireResponseDto> responseEntity = restTemplate.postForEntity(
                ChatGptRoutes.API_URL, requestDtoHttpEntity,RequireResponseDto.class);

        return responseEntity.getBody();
    }


    @Override
    public RequireResponseDto askQuestion(QuestionRequestDto questionRequestDto) {
        return this.getResponse(
                this.buildHttpEntity(
                        new RequireRequestDto(
                                ChatGptRoutes.MODEL,
                                questionRequestDto.getMessage(),
                                ChatGptRoutes.TEMPERATURE,
                                ChatGptRoutes.MAX_TOKEN,
                                ChatGptRoutes.TOP_P)));
    }
    }

