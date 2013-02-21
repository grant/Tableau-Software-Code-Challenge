/*
  Contains a method to b-search a float array
*/
public class BinarySearch {
	private static final int KEY_NOT_FOUND_INDEX = -1;

	// Searches an array of floats and returns the index
	// Assume the data is in a sorted array of floats
	public static int search(float[] array, float key) {
		return search(array, key, 0, array.length);
	}

	private static int search(float[] array, float key, int minIndex, int maxIndex) {
		// While there is a subarray to still search
		while (maxIndex >= minIndex) {
			int midIndex = minIndex + ((maxIndex - minIndex) / 2);

			if (array[midIndex] < key) {
				// next time search upper array
				minIndex = midIndex + 1;
			} else if (array[midIndex] > key) {
				// next time search lower array
				maxIndex = midIndex - 1;
			} else {
				// key found at middle index
				return midIndex;
			}
		}

		// key not found
		return KEY_NOT_FOUND_INDEX;
	}
}