package com.pjw.web_base.service.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjw.web_base.dao.TestDao;
import com.pjw.web_base.service.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;

	@Override
	public List<Map<String, Object>> inserttest(Map<String, Object> commandMap) throws Exception{
	
			 testDao.test(commandMap);
			 testDao.testt(commandMap);
		return null;
	}
	
	
}
