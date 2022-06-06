package com.example.springweb.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //옵셔널(어카운트 아이디), 리스트(아이디)

    Optional<Posts> findByTitle(String title);
}
