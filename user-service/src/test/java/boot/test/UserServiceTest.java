package boot.test;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Category(UnitTest.class)
public class UserServiceTest {

	@Test
	public void test() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
