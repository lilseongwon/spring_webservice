package com.example.springweb.Dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class ListResponseDto {
    private final List<ResponseDto> postsLists;
}
