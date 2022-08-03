package com.blog.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.blog.admin.dto.Posts;
import com.blog.admin.dto.UserPosts;
import com.blog.admin.dto.Users;
import com.blog.admin.service.PostCreationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserPostsController {

	@Autowired
	private PostCreationService postCreationService;
	
	@RequestMapping("/users")
	@GetMapping(produces = "application/json")
	private String getUsers() {
		String getUsersURI = "https://jsonplaceholder.typicode.com/users";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(getUsersURI, String.class);
	}
	
	@RequestMapping("/posts")
	@GetMapping(produces = "application/json")
	private String getPosts() {
		String getPostsURI = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(getPostsURI, String.class);
	}
	
	@RequestMapping("/userposts")
	@GetMapping(produces = "application/json")
	private String getUserPosts() {
		
		String users = getUsers();
		String posts = getPosts();
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			List<Users> userList = objectMapper.readValue(users, new com.fasterxml.jackson.core.type.TypeReference<List<Users>>() {});
			List<Posts> postList = objectMapper.readValue(posts, new com.fasterxml.jackson.core.type.TypeReference<List<Posts>>() {});
			
			List<UserPosts> userPostsList = new ArrayList<UserPosts>();
			for(Users user: userList) {
				for(Posts post:postList) {
					if(user.getUserId()==post.getUserId()) {
						UserPosts userPosts = new UserPosts();
						userPosts.setUserId(user.getUserId());
						userPosts.setName(user.getName());
						userPosts.setId(post.getId());
						userPosts.setAddress(user.getAddress());
						userPosts.setUsername(user.getUsername());
						userPosts.setPhone(user.getPhone());
						userPosts.setEmail(user.getEmail());
						userPosts.setBody(post.getBody());
						userPosts.setCompany(user.getCompany());
						userPosts.setTitle(post.getTitle());
						userPosts.setWebsite(user.getWebsite());
						userPostsList.add(userPosts);
					}
				}
			}
			return objectMapper.writeValueAsString(userPostsList);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/createpost")
	@PostMapping(consumes = "application/json")
	public String createPost(@RequestBody Posts post){
		
		return postCreationService.createPost(post);
	}
}
