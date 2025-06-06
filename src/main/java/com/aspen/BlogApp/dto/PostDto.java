package com.aspen.BlogApp.dto;

import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class PostDto {

    private String title;
    private String content;
    private String imageName;
    private Date uploadDate;
    private CategoryDto category;
    private UserResponseDto user;
    private Set<CommentDto> comments = new HashSet<>();

}
