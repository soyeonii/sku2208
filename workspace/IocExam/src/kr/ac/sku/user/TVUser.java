package kr.ac.sku.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.sku.ioc.TV;

public class TVUser {
	public static void main(String[] args) {
//		TV tv = new DingdingTV();
//		TV tv = TVFactory.getTV(args[0]);
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV) factory.getBean("dingTV");
		tv.turnOn();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();

//		BTV tv = new BTV();
//		tv.turnOnTV();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOffTV();
	}
}
