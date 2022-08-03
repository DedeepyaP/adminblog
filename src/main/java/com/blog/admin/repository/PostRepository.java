package com.blog.admin.repository;

import java.io.FileOutputStream;

import org.springframework.stereotype.Repository;

import com.blog.admin.dto.Posts;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class PostRepository {

	public String createPost(Posts post) {
		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			FileOutputStream fileOutputStream = new FileOutputStream("post.json");
			objectMapper.writeValue(fileOutputStream,post);
			return "Post Created Sucessfully";
		}catch(Exception exception) {
			exception.printStackTrace();
			return "Error creating the post for user : "+post.getUserId();
		}
		
	}
}
