package com.example.springweb.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor //왜 베이스엔티티에는 생성자가 없는가
public class PostsDto {
    private String title;
    private String content;
    private String author;
}
