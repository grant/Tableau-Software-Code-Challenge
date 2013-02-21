import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

	@Test
	public void testSearch() {
		float[] array = new float[]{1.1f, 4.3f, 7.5f, 21.3f, 22.2f};
		int expectedOutput = 2;
		int actualOutput = BinarySearch.search(array, 7.5f);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSearchNotFound() {
		float[] array = new float[]{1.1f, 4.3f, 7.5f, 21.3f, 22.2f};
		int expectedOutput = -1;
		int actualOutput = BinarySearch.search(array, 1.5f);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSameRoundedValue() {
		float[] array = new float[]{1.1f, 1.3f, 1.5f, 1.8f, 1.9f};
		int expectedOutput = 4;
		int actualOutput = BinarySearch.search(array, 1.9f);
		assertEquals(expectedOutput, actualOutput);
	}
}