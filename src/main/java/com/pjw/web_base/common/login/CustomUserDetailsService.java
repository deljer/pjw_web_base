package com.pjw.web_base.common.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService{

	  @Autowired
	    private UserAuthDao userAuthDAO;

	@Override
	public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {
		CustomUserDetails result =null;
		result = userAuthDAO.selectUserInfo(userid); 
		if(result == null) {
			throw new UsernameNotFoundException(userid);
		}
		return result;
	}

}
