package tips;

public class ExampleClass {
	public void publicMethod() {}
	protected void protectedMethod() {}
	private void  privateMethod() {}
	void defaultMethod() {}
	
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.protectedMethod();
		exampleClass.privateMethod();
		exampleClass.defaultMethod(); //같은 클래스 안에서는 어떤것이든 접근 가능
	}
}
