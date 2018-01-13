package sort;

public class Merge extends Sort {


    /**
     * sort starts the merge sort recursion process.
     * @param elements int array of elements to be sorted
     */
	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
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
     */
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


        // i is the pointer that keeps track of the index from the left side array


        // j is the pointer that keeps track of the index from the right side array


        // k is the pointer that keeps track of the index of the array you are
        // building with the merge


        // as long as one of the two pointers to the left or right side array 
        // has not passed their last index - keep doing this loop....

            // if the current left array value is less than the current right 
            // array value - place it in the next spot in the temp array

	    // else place the current value from the right side array in the
            // next spot in the temp array
            
            // next temp array position
        // end while            
        

        // if I am here - one of the pointers to either the left or right side
        // array has gone past its end and has no more elements to contribute 
        // to the temp array - so I will run just one of the below  blocks to 
        // place the rest of the sorted elements in the temp array - the other 
        // block will not run because the pointer has past the ending value.


        // transfer all temp elements to the actual array we are using
	
}
