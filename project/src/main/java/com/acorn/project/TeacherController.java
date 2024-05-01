package com.acorn.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

	
	
	@RequestMapping("/main")
	public String main() {
	
		return "main";
	}
	
	
}
