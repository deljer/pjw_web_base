package com.pjw.web_base.common.login;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails{

	
	/*
	 * getAuthorities() Collection<? extends GrantedAuthority> 계정이 갖고있는 권한 목록을 리턴한다.
	 * getPassword() String 계정의 비밀번호를 리턴한다. getUsername() String 계정의 이름을 리턴한다.
	 * isAccountNonExpired() boolean 계정이 만료되지 않았는 지 리턴한다. (true: 만료안됨)
	 * isAccountNonLocked() boolean 계정이 잠겨있지 않았는 지 리턴한다. (true: 잠기지 않음)
	 * isCredentialNonExpired() boolean 비밀번호가 만료되지 않았는 지 리턴한다. (true: 만료안됨)
	 * isEnabled() boolean 계정이 활성화(사용가능)인 지 리턴한다. (true: 활성화)
	 */

	private String user_id;
	private String user_name;
	private String user_pwd;
	private String user_authority;
	private String USER_ENABLED;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
	        auth.add(new SimpleGrantedAuthority(user_authority));
	        return auth;
	}

	
	
	public String getUser_id() {
		return user_id;
	}

	@Override
	public String getPassword() {
		return user_pwd;
	}

	@Override
	public String getUsername() {
		return user_name;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		if(USER_ENABLED.equals("1")) {
			return true;	
		}else {
			return false;
		}
		
	}

}
