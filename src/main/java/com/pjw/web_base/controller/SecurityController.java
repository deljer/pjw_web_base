package com.pjw.web_base.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjw.web_base.common.util.CommandMap;

@Controller
public class SecurityController {
	
	private Logger logger = LogManager.getLogger(SecurityController.class);

	@RequestMapping(value="/login/loginView.do")
	public ModelAndView loginView(CommandMap commandMap) throws Exception{
		return  new ModelAndView("/login/login_login");
	}
	@RequestMapping(value="/login/accessDeniedView.do")
	public ModelAndView accessDeniedView(CommandMap commandMap) throws Exception{
		return  new ModelAndView("/login/accessDenied");
	}
	@RequestMapping(value="/main/mainView.do")
	public ModelAndView mainView(CommandMap commandMap) throws Exception{
		return  new ModelAndView("/main/main");
	}
	
}
