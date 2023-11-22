package com.instgram.instagramclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private String post;
    private String name;
    private String email;
    private String file;
    private String profilePic;
}
