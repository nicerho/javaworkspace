package tips;

// import java.lang.* 는 기본적으로 적용된다
import java.math.BigDecimal;
import java.util.ArrayList;
import static java.util.Collections.*;

import static java.lang.System.out;

public class ImportRunner {
	public static void main(String[] args) {
		BigDecimal db = null;
		out.println("Imports");
		out.println("Static Imports");
		// Collections.sort(new ArrayList<String>());
		sort(new ArrayList<String>()); // import static 을 통해 구체적으로 어느클래스의 메소드인지 특정해주지 않아도 된다...
	}
}
