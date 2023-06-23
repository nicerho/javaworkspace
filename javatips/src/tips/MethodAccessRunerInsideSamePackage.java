package tips;

public class MethodAccessRunerInsideSamePackage {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.protectedMethod();
		//exampleClass.privateMethod(); //private는 같은 패키지 내에서도 접근 불가능..
		exampleClass.defaultMethod(); //protected, default는 다른 패키지에서 접근 불가능..
	}
}
