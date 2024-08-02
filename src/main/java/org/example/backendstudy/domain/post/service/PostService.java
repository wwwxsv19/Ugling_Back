package org.example.backendstudy.domain.post.service;

import lombok.RequiredArgsConstructor;
import org.example.backendstudy.domain.post.Post;
import org.example.backendstudy.domain.post.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

}
