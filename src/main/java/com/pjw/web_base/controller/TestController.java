package com.pjw.web_base.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pjw.web_base.HomeController;
import com.pjw.web_base.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value="/openSampleBoardList.do") 
	public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/home"); 
		List<Map<String,Object>> list = testService.test(commandMap); 
		mv.addObject("list", list); 
		return mv; 
	}

	
	
}
