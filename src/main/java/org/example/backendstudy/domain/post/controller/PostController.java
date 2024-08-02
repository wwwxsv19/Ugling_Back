package org.example.backendstudy.domain.post.controller;

import lombok.RequiredArgsConstructor;
import org.example.backendstudy.domain.post.Post;
import org.example.backendstudy.domain.post.controller.dto.CreateRequest;
import org.example.backendstudy.domain.post.controller.dto.CreateResponse;
import org.example.backendstudy.domain.post.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController // .json 데이터 형식으로 req res 주고 받아요
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public CreateResponse createPost(@RequestBody CreateRequest request) {
        String writer = request.getWriter();
        String message = request.getMessage();

        Post post = Post.builder()
                .writer(writer)
                .message(message)
                .build();

        Post savedPost = postService.savePost(post);

        CreateResponse response = CreateResponse.builder()
                .post(savedPost)
                .build();

        return response;
    }
}


/*

GET
가져오는 거
= url에 데이터 실어보내는 거 = url에 데이터가 포함되는 거
http://localhost:8080?id=1

남이 올린 특정한 게시물의 아이디를 활용해 그 게시물 조회 -> id << 중요하지 않은 데이터 GET OK

로그인 얼굴 사진 이메일 비밀번호 집 주소 GET NO POST OK

*/