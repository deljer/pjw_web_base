package com.pjw.web_base.service.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjw.web_base.dao.TestDao;
import com.pjw.web_base.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;

	@Override
	public List<Map<String, Object>> test(Map<String, Object> commandMap) throws Exception{
		List<?> a= null;
		try {
			a= testDao.test(commandMap);
		}catch (Exception e) {
			
		}
		return null;
	}
	
	
}
