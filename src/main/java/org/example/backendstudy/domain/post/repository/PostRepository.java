package org.example.backendstudy.domain.post.repository;

import org.example.backendstudy.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
