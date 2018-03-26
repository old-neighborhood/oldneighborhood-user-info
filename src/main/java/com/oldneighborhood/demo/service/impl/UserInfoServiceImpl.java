package com.oldneighborhood.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldneighborhood.demo.dao.UserInfoDao;
import com.oldneighborhood.demo.entity.UserInfo;
import com.oldneighborhood.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public UserInfo getUserInfo(String u_ID) {
		// TODO Auto-generated method stub
	
		return userInfoDao.findOne(u_ID);
	}

	@Override
	public void update(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userInfoDao.save(userInfo);
	}



}
