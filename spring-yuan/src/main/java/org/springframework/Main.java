package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.yuan.entity.SimpleBean;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}
}