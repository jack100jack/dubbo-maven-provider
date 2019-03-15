package com.atguigu.gmall.bean;
import  java.io.Serializable;

public class UserAddress implements Serializable{
   private Integer id;
   private String  userAddress;
   private String  userId;
   private String  consignee;//get
   private String  phoneNum;//tel
   private String  isDefault;
   
   public UserAddress(){
   
      super();
   }
   
   public UserAddress(Integer id,String  userAddress,String  userId,String  consignee,String  phoneNum,String  isDefault){
	   this.id=id;
        this.userAddress=userAddress;
        this.userId=userId;
        this.consignee=consignee;
        this.phoneNum=phoneNum;
        this.isDefault=isDefault;
   }


}