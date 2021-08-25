package com.bjpowernode.settings.test;

import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.MD5Util;
import org.junit.Test;


public class Test1 {
@Test
    public static void main(String[] args) {
    //验证登录时间
//        System.out.println(123);
//
//        String expireTime = "2019-10-10 10:10:10";
//        String currentTime = DateTimeUtil.getSysTime();
//
//        int count = expireTime.compareTo(currentTime);
//        System.out.println(count);

//    //验证登录状态
//    String lockState = "0"; //0代表锁定 1代表启用
//    if("0".equals(lockState)){
//        System.out.println("账号已锁定");
//    }

    //验证ip地址
//    String ip = "192.168.1.1";
//    String allowsip = "192.168.1.1,192.168.1.2";
//
//    if(allowsip.contains(ip)) {
//        System.out.println("有效ip地址，允许访问系统");
//    }else {
//        System.out.println("ip地址受限，请联系管理员");
//    }

    //对密码进行Md5加密
    String pwd = "123";
    pwd = MD5Util.getMD5(pwd);
    System.out.println(pwd);
    }
}
