import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestHelloWorld
{

	@Test
	void test() {
		String message ="Hello world!";
		HelloWorld hello = new HelloWorld();
		assertEquals(message,hello.getMessage());
	}

}
