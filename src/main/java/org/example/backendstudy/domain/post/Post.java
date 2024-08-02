package org.example.backendstudy.domain.post;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String writer;
    private LocalDate CreatedAt;
    private String message;

    @Builder
    public Post(String writer, String message) {
        this.writer = writer;
        this.CreatedAt = LocalDate.now();
        this.message = message;
    }


//    private List<Comment> // 1 : n <- 연관관계

}
/*
Java

Post 글 데이터 형식
작성자 작성날짜 제목 내용 댓글 => Post.java

이런 Post를 저장할 수 있는 레포지토리 ( = 디비 ) = PostRepository.java

Post 레포지토리에서 이런저런 포스트 데이터를 읽어오는 로직 수행 => PostService.java

url 로 api 요청을 받았을 때 응답할 수 있는 => PostController.java
*/