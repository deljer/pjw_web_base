package com.pjw.web_base.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

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
		ModelAndView mv = new ModelAndView("");
		logger.info(mv);
		if(commandMap.isEmpty() == false){
			Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
			Entry<String,Object> entry = null;
			while(iterator.hasNext()){
				entry = iterator.next();
				logger.debug("key : "+entry.getKey()+", value : "+entry.getValue());
			}
		}
		return mv;
	}

}
