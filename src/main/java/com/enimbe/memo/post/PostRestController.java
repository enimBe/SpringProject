package com.enimbe.memo.post;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/post")
public class PostRestController {

	public Map<String, String> create(
			@RequestParam("subject") String subject,
			@RequestParam("content") String content,
			@RequestParam("formData") MultipartFile file,
			) {
		
	}
}
