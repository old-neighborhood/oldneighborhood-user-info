package com.oldneighborhood.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.oldneighborhood.demo.entity.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo,Serializable>{
	
	

}
