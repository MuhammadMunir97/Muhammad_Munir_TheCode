package com.muhammad.thecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "/Home.jsp";
	}
	
	@RequestMapping(value="/verify", method=RequestMethod.POST)
    public String login(@RequestParam(value="code") String code) {
		code = code.toLowerCase();
		if (code.equals("bushido")) {
			return "code.jsp";
		}
		return "redirect:/Error";
	}
	
	@RequestMapping("/Error")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You need to Train harder!");
        return "redirect:/";
	}
}
