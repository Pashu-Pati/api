package com.rest.api.article.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CommentWithPostDto {

    private Long comment_id;

    private String text;

    private LocalDateTime createdAt;

    private PostWithoutCommentDto postWithoutCommentDto;

}