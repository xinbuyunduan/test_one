package com.login;

import com.global.GlobalAction;
import com.vo.UserInfo;

public class LoginAction extends GlobalAction{
	private UserInfo user=new UserInfo();
	
	public String tologin(){
		String name=user.getName();
		String pwd=user.getPwd();
		if(!("dai".equals(name) && "1".equals(pwd))){
			return "error";
		}
		return "success";
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
	
}
