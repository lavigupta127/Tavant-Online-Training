import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
class TestMarkValidator 
{
  @Test
	void test() {
		MarkValidator markValidator =new MarkValidator();
		Scanner b = new Scanner(System.in);
		int mark= b.nextInt();
		boolean actual= true;
		boolean expe = markValidator.isPass(mark);
		if(expe!=false) {
			markValidator.markGrade(mark);
			assertEquals(actual,expe);
		}else
		{
			assertNotEquals(actual,expe);
		}
		
	}

}
