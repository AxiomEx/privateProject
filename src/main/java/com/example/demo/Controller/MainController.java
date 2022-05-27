package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		return "/index";
	}
	
	@GetMapping("/graph")
	public String graph() {
		return "/graph";
	}

	@GetMapping("/student")
	public String student(){
		return "/student";
	}
	
	@GetMapping("/regist")
	public String regist(){
        System.out.println("aaaa");
		return "regist";
	}

	


}
