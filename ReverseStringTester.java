import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTester {

	@Test
	public void testReverseString() {
		String expectedOutput = "hello";
		String actualOutput = ReverseString.reverse("olleh");
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testReverseEmptyString() {
		String expectedOutput = "";
		String actualOutput = ReverseString.reverse("");
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testReverseLongString() {
		String expectedOutput = "how are you doing today";
		String actualOutput = ReverseString.reverse("yadot gniod uoy era woh");
		assertEquals(expectedOutput, actualOutput);
	}
}