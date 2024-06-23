package com.teja.learn_spring_framework_helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1. Launch a spring context

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2.Configure what the spring need to manage.-Configuration class
		System.out.println(context.getBean("getName"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("address1"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person4"));

		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
