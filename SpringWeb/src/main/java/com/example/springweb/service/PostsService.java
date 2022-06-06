package com.example.springweb.service;


import com.example.springweb.Dto.PostsDto;
import com.example.springweb.Dto.ResponseDto;
import com.example.springweb.Dto.UpdateDto;
import com.example.springweb.posts.Posts;
import com.example.springweb.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostsService {
    private final PostsRepository postsRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void post(PostsDto postsDto){
        postsRepository.save(
                Posts.builder()
                        .title(postsDto.getTitle())
                        .content(postsDto.getContent())
                        .author(postsDto.getAuthor())
                        .build());
    }
    @Transactional
    public void update(Long id, UpdateDto updateDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다."));
        posts.update(updateDto.getTitle(), updateDto.getContent());
    }
    @Transactional
    public void delete(Long id){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다."));
        postsRepository.delete(posts);
    }

    @Transactional
    public ResponseDto search(Long id){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다."));
        return ResponseDto.builder()
                .title(posts.getTitle())
                .content(posts.getContent())
                .author(posts.getAuthor())
                .build();
    }
}
