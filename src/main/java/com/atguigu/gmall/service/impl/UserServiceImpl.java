package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
@Service
public class UserServiceImpl implements UserService  {

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1=new UserAddress(1,"╠╠╬м","1","1111","111","111");
	      UserAddress address2=new UserAddress(2,"доят","2","2222","222","222");
	      return Arrays.asList(address1,address2);

	}

}