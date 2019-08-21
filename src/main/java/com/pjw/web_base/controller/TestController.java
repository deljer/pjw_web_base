package com.pjw.web_base.controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjw.web_base.common.util.CommandMap;
import com.pjw.web_base.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	private static final Logger logger = LogManager.getLogger(TestController.class);

	@RequestMapping(value="/openSampleBoardList.do") 
	public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/home"); 
		List<Map<String,Object>> list = testService.inserttest(commandMap); 
		mv.addObject("list", list); 
		return mv; 
	}
	@RequestMapping(value="/test2.do")
	public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/home");
		logger.info("test ");
		
		return mv;
	}

}
