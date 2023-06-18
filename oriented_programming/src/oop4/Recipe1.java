package oop4;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("손질");
		;
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("요리");
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("정리");
	}

}
