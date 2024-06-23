package com.teja.learn_spring_frame_work.injection.examples;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
record ExampleClass2() {
}

@Component
class ExampleClass {

	private Dependency1 dependency1;

	private Dependency2 dependency2;

	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}

	@Autowired
	public ExampleClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	@Override
	public String toString() {

		StringBuilder newString = new StringBuilder();

		newString.append("Using:  ");
		newString.append(dependency1);
		newString.append(dependency2);

		return newString.toString();
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan

public class DepInjectionExampleApplication2 {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionExampleApplication2.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("exampleClass"));

		}

	}

}
