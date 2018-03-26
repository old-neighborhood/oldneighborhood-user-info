package com.oldneighborhood.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import com.oldneighborhood.demo.entity.UserInfo;



public interface UserInfoService {

	UserInfo getUserInfo(String u_ID);

	void update(UserInfo userInfo);

}
