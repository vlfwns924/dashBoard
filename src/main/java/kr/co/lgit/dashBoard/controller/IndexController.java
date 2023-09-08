package kr.co.lgit.dashBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	/* 할일
	 - 사이드바 통일 시키기
	 - href= src= 두가지에 경로설정 ${pageContext.request.contextPath}/resources/
	 - "index.html"을 "/"로 바꾸기
	  
	 */

	/* DashBoard ****************************************/
	@GetMapping("/")
	public String index() {
		return "index/index";
	}
	
	
	/* Components ****************************************/
	@GetMapping("/buttons")
	public String buttons() {
		return "index/buttons";
	}
	
	@GetMapping("/cards")
	public String cards() {
		return "index/cards";
	}
	
	
	/* Utilities ****************************************/
	@GetMapping("/utilities-color")
	public String color() {
		return "index/utilities-color";
	}
	
	@GetMapping("/utilities-borders")
	public String borders() {
		return "index/utilities-borders";
	}
	
	@GetMapping("/utilities-animations")
	public String animations() {
		return "index/utilities-animations";
	}
	
	@GetMapping("/utilities-other")
	public String other() {
		return "index/utilities-other";
	}
	
	
	/* Pages ****************************************/
	@GetMapping("/login")
	public String login() {
		return "index/login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "index/register";
	}
	
	@GetMapping("/forgot-password")
	public String password() {
		return "index/forgot-password";
	}
	
	@GetMapping("/blank")
	public String blank() {
		return "index/blank";
	}
	
	@GetMapping("/404")
	public String _404() {
		return "index/404";
	}
	
	
	/* Charts ****************************************/
	@GetMapping("/charts")
	public String charts() {
		return "index/charts";
	}
	
	
	/* Tables ****************************************/
	@GetMapping("/tables")
	public String tables() {
		return "index/tables";
	}
	
}
