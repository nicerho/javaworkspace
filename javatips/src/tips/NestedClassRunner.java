package tips;

class DefaultClass {

}

public class NestedClassRunner {
	int i;

	class InnerClass {
		public void method() {
			i = 5;
		}
	}

	static class StaticNestedClass {
		public void method() {
			// i = 5;
		}
	}

	public static void main(String[] args) {
		NestedClassRunner ncr = new NestedClassRunner();
		InnerClass ic = ncr.new InnerClass();
		StaticNestedClass sc = new StaticNestedClass();
	}
}
