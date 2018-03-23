package com.oldneighborhood.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oldneighborhood.demo.entity.UserInfo;
//import com.oldneighborhood.demo.entity.User;
//import com.oldneighborhood.demo.entity.UserType;
import com.oldneighborhood.demo.service.UserInfoService;


@RestController
public class UserInfoController {
	
	@Autowired
	private UserInfoService  userInfoService;
	
	@Autowired
	private UserInfo userInfo;
	
	@RequestMapping(path= {"/user/{u_ID}"} , method = {RequestMethod.GET})
	public String getUserInfo(@PathVariable(name="u_ID") int u_ID) {
		
		userInfo = userInfoService.getUserInfo(u_ID);
		return "true";
	}
	
	

}
