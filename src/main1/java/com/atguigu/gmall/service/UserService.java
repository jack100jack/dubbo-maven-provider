package com.atguigu.gmall.service;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;



public interface UserService{

  public List<UserAddress> getUserAddressList(String userId);
  
 }