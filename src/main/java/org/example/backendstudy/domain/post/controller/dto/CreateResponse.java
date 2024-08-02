package org.example.backendstudy.domain.post.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.backendstudy.domain.post.Post;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateResponse {
    private Post post;
}
