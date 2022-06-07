package com.example.springweb.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseDto {
    private final String title;
    private final String content;
    private final String author;

}
