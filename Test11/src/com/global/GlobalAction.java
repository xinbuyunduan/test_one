package com.global;

import com.opensymphony.xwork2.Action;

public class GlobalAction implements Action {

	public String execute() throws Exception {
		System.out.println("GlobalAction++++++++++++");
		return null;
	}
	
}
