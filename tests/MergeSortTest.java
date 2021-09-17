package tests;

/**
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import individualExercise.MergeSort;

/**
 * @author khodosko
 *
 */
class MergeSortTest {
	MergeSort sortTest = new MergeSort();

	@Test
	void mergeSortTest() {
		int arr [] = {3, 6, 1, 4};
		sortTest.mergeSort(arr, 0, arr.length - 1);
		
		int sortedArr [] = {1, 3, 4, 6};
		Assert.assertArrayEquals(sortedArr, arr);
		
	}

}

