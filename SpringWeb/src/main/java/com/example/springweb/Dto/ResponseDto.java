package com.example.springweb.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
public class ResponseDto {
    private final String title;
    private final String content;
    private final String author;

}
