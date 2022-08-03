package com.blog.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.admin.dto.Posts;
import com.blog.admin.repository.PostRepository;

@Service
public class PostCreationService {

	@Autowired
	private PostRepository postRepository;
	
	public String createPost(Posts post) {
		return postRepository.createPost(post);
	}
	
}
