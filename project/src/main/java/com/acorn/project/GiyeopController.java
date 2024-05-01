package com.acorn.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GiyeopController {

	
	
	@RequestMapping("/gy")
	public String main() {
	
		return "giyeop";
	}
	
	
}
