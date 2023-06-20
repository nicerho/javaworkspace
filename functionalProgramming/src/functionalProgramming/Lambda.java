package functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number%2==0;
	}
	
}

public class Lambda {
	public static void main(String[] args) {
		List.of(36, 48, 23, 43, 34, 45).stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
	}
}
