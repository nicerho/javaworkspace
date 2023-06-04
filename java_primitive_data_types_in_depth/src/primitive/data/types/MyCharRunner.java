package primitive.data.types;

public class MyCharRunner {
	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');

		System.out.println(myChar.isVowel());
		myChar.isConsonant();
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets(); // 정적메서드
		MyChar.printUpperCaseAlphabets();

	}
}
