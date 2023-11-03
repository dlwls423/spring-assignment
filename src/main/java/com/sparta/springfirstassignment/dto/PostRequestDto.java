package com.sparta.springfirstassignment.dto;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private String title;
    private String username;
    private Long pw;
    private String contents;
}
