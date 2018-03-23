package com.oldneighborhood.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import com.oldneighborhood.demo.dao.UserInfoDao;
import com.oldneighborhood.demo.entity.UserInfo;
import com.oldneighborhood.demo.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public UserInfo getUserInfo(int u_ID) {
		// TODO Auto-generated method stub
	
		return userInfoDao.findOne(u_ID);
	}



}
