package com.sparta.springfirstassignment.dto;

import com.sparta.springfirstassignment.Entity.Post;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private Long postId;
    private String title;
    private String username;
    private String contents;

    public PostResponseDto(Post post){
        this.postId = post.getPostId();
        this.title = post.getTitle();
        this.username = post.getUsername();
        this.contents = post.getContents();
    }
}
