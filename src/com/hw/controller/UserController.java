package com.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
		
	@RequestMapping("/userlist.do")
	public String main(Model m) {
		//View�� ������ Model�� ���� �� ����
		m.addAttribute("center", "user/list");
		return "main";
	}
	
	@RequestMapping("/useradd.do")
	public String main2(Model m) {
		//View�� ������ Model�� ���� �� ����
		m.addAttribute("center", "user/add");
		return "main";
	}
	
}