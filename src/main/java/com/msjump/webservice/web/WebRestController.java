package com.msjump.webservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.msjump.webservice.PostsService;
import com.msjump.webservice.domain.posts.PostsRepository;
import com.msjump.webservice.domain.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	
	@Autowired
    PostsRepository postsRepository;
	
    private PostsService postsService;
	
	@GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
	
	 @PostMapping("/posts")
	    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
	        return postsService.save(dto);
	    }

}
