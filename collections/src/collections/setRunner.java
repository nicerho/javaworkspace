package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setRunner {
	public static void main(String[] args) {
		List<Character> character = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// Unique - Set
		// Tree, Hash, LinkedHash
		Set<Character> treeSet = new TreeSet<>(character);
		System.out.println("treeSet" + treeSet);
		Set<Character> linkedHashSet = new LinkedHashSet<>(character);
		System.out.println("linkedHashSet" + linkedHashSet);
		Set<Character> hashSet = new HashSet<>(character);
		System.out.println("hashSet" + hashSet);
	}
}
