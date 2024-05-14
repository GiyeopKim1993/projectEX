package com.acorn.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WJ {
	
	
	@GetMapping("/wj")
	public String test() {
		return  "wjview";
		
	}

}
