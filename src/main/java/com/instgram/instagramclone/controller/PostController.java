package com.instgram.instagramclone.controller;

import com.instgram.instagramclone.model.Post;
import com.instgram.instagramclone.model.PostRequest;
import com.instgram.instagramclone.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(value = "/addpost",
            consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> addPosts(@RequestBody PostRequest postRequest) throws Exception {
        String strPost = postRequest.getPost();
        String email = postRequest.getEmail();
        String name = postRequest.getName();
        String file = postRequest.getFile();
        String profilePic = postRequest.getProfilePic();

        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();
        postService.addPost(post);

        String msg = "Post Created successfully..";

        return new ResponseEntity<>(msg, HttpStatus.CREATED);


    }

    @GetMapping( "/getposts")
    public List<Post> getPost() {
        return postService.getPost();
    }
}
