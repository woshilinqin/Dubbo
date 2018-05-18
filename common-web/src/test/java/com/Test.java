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
		context.start();
		UserService pf= (UserService)context.getBean("userService");
		System.out.println("ffffffffffffffffffffffffffffff");
		System.out.println(Test.class.getResource("/").getPath());
		
		System.out.println(pf.getCountNum());
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
		System.out.println("ggg");
	}

}
