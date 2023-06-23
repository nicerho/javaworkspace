package tips;

final class FinalClass {
	// 클래스가 final로 선언되면 어느 클래스도 final로 선언된 클래스를 상속받을 수 없다
}

//class SomeClass extends FinalClass{}
class SomeClass {
	public final void doSomething() {
	}

	public void doSomethingElse(final int arg) {
		//arg = 6 ; 
	}
}

class ExtendingClass extends SomeClass {
	// public void doSomething() {} // 메소드에 final이 선언되면 오버라이딩이 불가능하다 그럼 왜 쓰는걸까 ?
	// 상속받은 클래스에서 해당 메소드를 변경없이 수행시키고 싶을 떄 쓴다고 생각하자

}

public class FinalNonAccessModifierRunner extends SomeClass {
	public static void main(String[] args) {
		FinalNonAccessModifierRunner a = new FinalNonAccessModifierRunner();
		a.doSomething();
		final int i;
		i = 5; // 처음에 부여해주는건 가능
		// i = 7; 변수에 final을 입력하면 변경도 불간응
		// 그러면 왜 변수나 매개변수에 final을 꾸역꾸역 붙일까??
		// 일단은 그렇게 붙이는게 변수의 값이 변경되는 일을 방지해서 보다 읽기 쉽고 이해하기 쉬운 코드를 생성할 수 있다고 하는데 
		// 모든 변수나 매개변수를 final을 붙여서 만들긴 어려우니, 가능한 대부분 그렇게 하는걸 국룰이라고 생각하자
	}
}
