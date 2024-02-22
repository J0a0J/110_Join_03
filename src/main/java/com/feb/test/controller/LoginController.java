package com.feb.test.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feb.test.service.MemberService;

@Controller
public class LoginController {
	
	
	@Autowired
	private MemberService memberService;

	public LoginController() {
		System.out.println("First!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@GetMapping("/login.do")
	public String login() {
		return "login";
	}
	
	@PostMapping("/join.do")
	public ModelAndView loginPage(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();
		int result = memberService.join(params);
		
		if (result != 1) {
			mv.addObject("resultMsg", "회원가입 실패 ");
			mv.setViewName("error");
			return mv;
		}
		mv.addObject("resultMsg", "회원가입 성공 ");
		mv.setViewName("info");
		return mv;
	}
	
	
}
