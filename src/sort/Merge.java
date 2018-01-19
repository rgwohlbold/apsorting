package sort;

public class Merge extends Sort {


    /**
     * sort starts the merge sort recursion process.
     * @param elements int array of elements to be sorted
     */
	@Override
	public int[] sort(int[] arr) {
		int[] temp = new int[arr.length];
		mergeSortEngine(arr, 0, arr.length - 1, temp);
		return arr;
	}



    /**
     * mergeSortEngine recursively splits a larger array into two smaller arrays
     * until the array is of one element in size.
     *
     * @param elements integer array that holds the two array sections to be
     * merged
     * @param from first index of the array
     * @param to the last index of the array
     * @param temp a temporary array for building the merge
     */
	private int[] merge(int[] left, int[] right) {
		return null;
	}
	
	private void mergeSortEngine(int[] elements, int from, int to, int[] temp) {
		if (from < to) {
			int middle = (from + to) / 2;
			mergeSortEngine(elements, from, middle, temp);
			mergeSortEngine(elements, middle + 1, to, temp);
			mergeArrays(elements, from, middle, to, temp);
		}
	}
	
	private void mergeArrays(int[] elements, int from, int middle, int to, int[] temp) {
		int i = from;
		int j = middle + 1;
		int k = from;
		
		while(i <= middle && j <= to) {
			bigOhCompare += 3; // three comparisons per iteration
			if (elements[i] < elements[j]) {
				temp[k++] = elements[i++];
			}
			else {
				temp[k++] = elements[j++];
			}
		}
		
		while (i <= middle) {
			temp[k++] = elements[i++];
			bigOhChange++;
		}
		
		while (j <= to) {
			temp[k++] = elements[j++];
			bigOhChange++;
		}
		
		for (k = from; k <= to; k++) {
			elements[k] = temp[k];
			bigOhChange++;
		}
	}

	/*
	/**
     * mergeArrays will merge two sorted arrays into one sorted array. It does
     * this by taking advantage of the fact that the two array are defined as
     * two sections of a larger array and that these two arrays are adjacent to
     * each in the larger array.
     *
     * @param elements integer array that holds the two array sections to be
     * merged
     * @param from first index of the left side array
     * @param middle the last index of the left side array
     * @param to the last index of the right side array
     * @param temp a temporary array for building the merge
     *
     
	public int[] mergeArrays2(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftPointer = 0;
		int rightPointer = 0;
		int finalPointer = 0;
		while (leftPointer < left.length && rightPointer < right.length) {
			if (left[leftPointer] < right[rightPointer]) {
				result[finalPointer++] = left[leftPointer++];
			} else {
				result[finalPointer++] = right[rightPointer++];
			}
		}
		if (leftPointer < left.length) {
			while (leftPointer < left.length)
				result[finalPointer++] = left[leftPointer++];
		}
		else {
			while (rightPointer < right.length)
				result[finalPointer++] = right[rightPointer++];
		}
		return result;
	}
	
	public int[] mergeArrays(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftPointer = 0;
		int rightPointer = 0;
		for (int i = 0; i < result.length; i++) {
			if (leftPointer == left.length) {
				result[i] = right[rightPointer++];
				continue;
			} else if (rightPointer == right.length) {
				result[i] = left[leftPointer++];
				continue;
			}		
			
			if (left[leftPointer] < right[rightPointer]) {
				result[i] = left[leftPointer++];
			}
			else {
				result[i] = right[rightPointer++];
			}
		}
		return result;
	}
	*/
}
