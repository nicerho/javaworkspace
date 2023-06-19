package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("a", 1), new Student("b", 2), new Student("c", 100));
		List<Student> studentsAl = new ArrayList<>(students);
		Collections.sort(studentsAl);
		System.out.println("오름차순" + studentsAl);
		Collections.sort(studentsAl, new DescendingComparator());


	}
}