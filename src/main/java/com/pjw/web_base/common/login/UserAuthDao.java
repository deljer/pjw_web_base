package com.pjw.web_base.common.login;

import org.springframework.stereotype.Repository;

import com.pjw.web_base.common.dao.AbstractDao;

@Repository
public class UserAuthDao extends AbstractDao{

	public CustomUserDetails selectUserInfo(String userid) {
		return (CustomUserDetails) selectOne("common.user.selectUserInfo", userid);
	}

}
