package com.oldneighborhood.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.oldneighborhood.demo.entity.UserInfo;
//import com.oldneighborhood.demo.entity.User;
//import com.oldneighborhood.demo.entity.UserType;
import com.oldneighborhood.demo.service.UserInfoService;


@Controller
public class UserInfoController {
	
	@Autowired
	private UserInfoService  userInfoService;
	
	
	@RequestMapping(path= {"/userinfo/{u_ID}"} , method = {RequestMethod.GET})
	public String getUserInfo(@PathVariable(name="u_ID") String u_ID, Map<String ,Object> map) {
		
		UserInfo userInfo = userInfoService.getUserInfo(u_ID);
		map.put("user", userInfo) ;
		return "/userinfo";
	}
	
	@RequestMapping(path= {"/userinfo/{u_ID}"} , method = {RequestMethod.POST}, 
			 consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, 
		        produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody String edit (@PathVariable("u_ID") String u_ID ,  @RequestParam Map<String ,Object> map) throws Exception{
		System.out.println("<<<<<<<<");
		System.out.println(map.get("u_name").toString());
		UserInfo userInfo = userInfoService.getUserInfo(u_ID);
		UserInfo moddle = new UserInfo(
				map.get("u_name").toString(),
				map.get("u_password").toString(),
				map.get("u_image").toString(),
				map.get("u_tele").toString(),
				map.get("u_email").toString(),
				map.get("u_signature").toString());
		System.out.println(map.get("u_tele").toString());
		userInfo.setU_name(moddle.getU_name());
		userInfo.setU_email(moddle.getU_email());;
		userInfo.setU_image(moddle.getU_image());
		userInfo.setU_password(moddle.getU_password());
		userInfo.setU_tele(moddle.getU_tele());
		userInfo.setU_signature(moddle.getU_signature());
		userInfoService.update(userInfo);
		return "redirect:/user/userinfo"+u_ID  ;
	}
	
	

}
