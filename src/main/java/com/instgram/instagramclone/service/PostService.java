package com.instgram.instagramclone.service;

import com.instgram.instagramclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
