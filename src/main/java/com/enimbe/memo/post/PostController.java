package com.enimbe.memo.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {

	@GetMapping("/list_view")
	public String listView() {
		
		//로그인한 사용자의 글만 가져온다.
		
		return "post/listView";
	}
	
	@GetMapping("/creat_view")
	public String createView() {
		return "post/createView";
	}
}
