package com.acorn.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hj {
	
	@RequestMapping("/hj")
	public String hj() {
		return "hj";
	}
	
	

}
