package oop4;

public class RecipeRunner {
	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		RecipeWithMicrowave rm = new RecipeWithMicrowave();
		rm.execute();
	}
}
