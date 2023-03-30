package com.sg.kim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("HTML 파일이 요청됨");
		return "redirect:starthere.html";
	}
	
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지파일이 요청됨");
		return "redirect:img/A.png";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("JSP파일이 요청됨");
		model.addAttribute("username", "김준혁입니다");
		return "hellojsp";
	}
}
