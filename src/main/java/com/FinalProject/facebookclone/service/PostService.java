package com.FinalProject.facebookclone.service;

import com.FinalProject.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
