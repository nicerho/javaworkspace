package com.example.springexam.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DepInhectionLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DepInhectionLauncherApplication.class);) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
