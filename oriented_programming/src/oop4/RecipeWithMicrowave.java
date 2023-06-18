package oop4;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("손질");
		System.out.println("렌지 켜기");
		;
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("요리");
		System.out.println("렌지에 넣기");
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("정리");
		System.out.println("렌지 끄기");
	}

}
