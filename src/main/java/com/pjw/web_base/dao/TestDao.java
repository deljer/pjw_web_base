package com.pjw.web_base.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pjw.web_base.common.dao.AbstractDao;


@Repository
public class TestDao extends AbstractDao{


	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> test(Map<String, Object> commandMap) {
		return (List<Map<String, Object>>)selectList("selecttest", commandMap);
	}

}
