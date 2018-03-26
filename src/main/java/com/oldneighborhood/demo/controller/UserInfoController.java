package com.oldneighborhood.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.oldneighborhood.demo.entity.UserInfo;
//import com.oldneighborhood.demo.entity.User;
//import com.oldneighborhood.demo.entity.UserType;
import com.oldneighborhood.demo.service.UserInfoService;


@Controller
public class UserInfoController {
	
	@Autowired
	private UserInfoService  userInfoService;
	

	private UserInfo userInfo;
	
	@RequestMapping(path= {"/userinfo/{u_ID}"} , method = {RequestMethod.GET})
	public String getUserInfo(@PathVariable(name="u_ID") String u_ID, Map<String ,Object> map) {
		
		userInfo = userInfoService.getUserInfo(u_ID);
		map.put("user", userInfo) ;
		return "/userinfo";
	}
	
	@RequestMapping(path= {"/userinfo/{u_ID}"} , method = {RequestMethod.POST})
	public String edit (@PathVariable("u_ID") String u_ID , Map<String ,Object> map) {
		System.out.println("<<<<<<<<<<<<<");
		userInfo.setU_name(map.get("u_name").toString());
		userInfo.setU_email(map.get("u_email").toString());;
		userInfo.setU_image(map.get("u_image").toString());
		userInfo.setU_password(map.get("u_password").toString());
		userInfo.setU_tele(map.get("u_tele").toString());
		userInfo.setU_signature(map.get("u_signature").toString());
		userInfoService.update(userInfo);
		return "redirect:/user/userinfo"+u_ID  ;
	}
	
	

}
