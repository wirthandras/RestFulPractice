package hu.wia.practice.restful.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Router {

	@RequestMapping("/")
	public String index() {
		return "greeting";
	}

}
