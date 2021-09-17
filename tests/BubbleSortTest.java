package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import individualExercise.BubbleSort;

class BubbleSortTest {
	BubbleSort testSort = new BubbleSort();

	@Test
	void bubbleSortTest() {
		int arr [] = {3, 6, 1, 4};
		testSort.bubbleSort(arr);
		
		int sortedArr [] = {1, 3, 4, 6};
		Assert.assertArrayEquals(sortedArr, arr);
		
	}

}
