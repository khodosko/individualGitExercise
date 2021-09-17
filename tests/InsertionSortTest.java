package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import individualExercise.InsertionSort;
import individualExercise.MergeSort;

class InsertionSortTest {

	InsertionSort sortTest = new InsertionSort();

	@Test
	void mergeSortTest() {
		int arr [] = {3, 6, 1, 4};
		sortTest.insertionSort(arr);
		
		int sortedArr [] = {1, 3, 4, 6};
		Assert.assertArrayEquals(sortedArr, arr);
		
	}

}

