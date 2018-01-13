package test.sort;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import sort.Bubble;
import sort.Insertion;
import sort.Merge;
import sort.Quick;
import sort.Selection;
import sort.Sort;

/**
 * Some unit testing action with JUnit
 * 
 * @author richard
 *
 */
class SortingTest {

	// Method to generate a random array
	private int[] randomArray() {
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return Sort.shuffle(arr);
	}
	
	// Test bubble sort
	@Test
	void testBubble() {
		int[] arr = randomArray();
		Sort sort = new Bubble();
		boolean res = Sort.isSorted(sort.sort(arr));
		assertTrue(res);
		System.out.println("Bubble sort\tOK");
	}
	
	// Test insertion sort
	@Test
	void testInsertion() {
		int[] arr = randomArray();
		Sort sort = new Insertion();
		boolean res = Sort.isSorted(sort.sort(arr));
		assertTrue(res);
		System.out.println("Insertion sort\tOK");
	}
	
	// Test insertion sort
	@Test
	void testSelection() {
		int[] arr = randomArray();
		Sort sort = new Selection();
		boolean res = Sort.isSorted(sort.sort(arr));
		assertTrue(res);
		System.out.println("Selection sort\tOK");
	}
	
	// Test Quicksort with pointers
	@Test
	void testQuickPointers() {
		int[] arr = randomArray();
		Sort sort = new Quick();
		boolean res = Sort.isSorted(sort.sort(arr));
		assertTrue(res);
		System.out.println("Quick sort with pointers\tOK");
	}
	
	// Test quicksort with wall
	@Test
	void testQuickWall() {
		int[] arr = randomArray();
		Quick sort = new Quick();
		sort.enableWall();
		boolean res = Sort.isSorted(sort.sort(arr));
		assertTrue(res);
		System.out.println("Quick sort with wall\tOK");
	}
	
	// Test mergeArrays with iteration until one array is empty
	@Test
	void testMergeArrays1() {
		int[] arr1 = randomArray();
		int[] arr2 = randomArray();
		Sort quicksort = new Quick();
		arr1 = quicksort.sort(arr1);
		arr2 = quicksort.sort(arr2);
		Merge sort = new Merge();
		int[] merged = sort.mergeArrays2(arr1, arr2);
		assertTrue(Sort.isSorted(merged));
	}
	
	// Test mergeArrays with iteration until the final array is full
	@Test
	void testMergeArrays2() {
		int[] arr1 = randomArray();
		int[] arr2 = randomArray();
		Sort quicksort = new Quick();
		arr1 = quicksort.sort(arr1);
		arr2 = quicksort.sort(arr2);
		Merge sort = new Merge();
		int[] merged = sort.mergeArrays(arr1, arr2);
		assertTrue(Sort.isSorted(merged));
	}

}
