package com;

import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/spring-context.xml" });
		UserService userService = (UserService)context.getBean("userService");
//		WeixinService weixinService=(WeixinService) context.getBean("weixinService");
		System.out.println(userService.getCountNum());
		context.start();
        /* 为保证服务一直开着，利用输入流的阻塞来模拟 */
		System.in.read();
	}

}
