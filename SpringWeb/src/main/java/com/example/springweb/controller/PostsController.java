package com.example.springweb.controller;

import com.example.springweb.Dto.PostsDto;
import com.example.springweb.Dto.ResponseDto;
import com.example.springweb.Dto.UpdateDto;
import com.example.springweb.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/content")
public class PostsController {
    private final PostsService postsService;
    @PostMapping("/post")
    public void post(@RequestBody PostsDto postsDto){
        postsService.post(postsDto);
    }
    @PutMapping("/update/{post-id}")
    public void update(@PathVariable("post-id") Long id, @RequestBody UpdateDto updateDto){
        postsService.update(id, updateDto);
    }
    @DeleteMapping("/delete/{post-id}")
    public void delete(@PathVariable("post-id") Long id){
        postsService.delete(id);
    }
    @GetMapping("/search/{post-id}")
    public ResponseDto search(@PathVariable("post-id") Long id, @RequestBody ResponseDto responseDto){
        return postsService.search(id);
    }
}
