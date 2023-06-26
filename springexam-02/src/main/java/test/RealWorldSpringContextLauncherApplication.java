package test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some Initializeation logic");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("wowowowow");
	}
}

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);) {
		System.out.println("Initialization of context is completed");
		context.getBean(ClassB.class).doSomething();

		}
	}
}
