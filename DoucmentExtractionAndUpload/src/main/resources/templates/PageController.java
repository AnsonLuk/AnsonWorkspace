package com.example.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
		// TODO Auto-generated constructor stub
		@Value("${hello:Hello default Anson}")
		private String hello = "Hello Anson";
		
		/*
		 * Default page 
		 * */
		@RequestMapping(value = {"/","/index"})
		public String index(Map<String, Object>model){
			 model.put("time", new Date());
		     model.put("message", this.hello);
		     return "index";
		}
		
		/*
		 * Responsing page 1 
		 * */
		@RequestMapping("/page1")
		public ModelAndView page1(){
			//page location: /WEB-INF/jsp/page/page.jsp
			ModelAndView mav = new ModelAndView("page/page1");
			mav.addObject("content",hello);
			return mav;
		}
		
		/*
		 * Responsing page 2
		 * */
		@RequestMapping("/page2")
		public String page2(Model model){
			model.addAttribute("content",hello + "the second ");
			return "page/page1";
		}
		
	

}
