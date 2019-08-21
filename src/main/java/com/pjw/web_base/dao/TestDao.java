package com.pjw.web_base.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pjw.web_base.common.dao.AbstractDao;


@Repository
public class TestDao extends AbstractDao{


	public int test(Map<String, Object> commandMap) throws Exception {
		return (int) insert("insertTest", commandMap);
	}

	public int testt(Map<String, Object> commandMap) throws Exception{
		return (int) insert("insertTest", commandMap);
	}

}
