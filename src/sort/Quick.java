package sort;

public class Quick extends Sort {

	private int[] arr;
	boolean useWalls = false;
	
	@Override
	public int[] sort(int[] arr) {
		this.arr = arr;
		if (useWalls)
			quicksortWithWall(0, arr.length - 1);
		else
			quicksortWithTwoPointers(0, arr.length - 1);
		return this.arr;
	}
	
	public void enableWall() {
		this.useWalls = true;
	}
	
	public void quicksortWithWall(int left, int right) {
		if (left == right)
			return;
		int pivotPointer = right;
		int pivot = arr[pivotPointer]; // to prevent n array lookups, store the pivot value
		int wall = left;
		int current = left;
		
		while(current < pivotPointer) {
			this.bigOhCompare += 2;
			if (arr[current] < pivot) {
				this.bigOhChange++;
				// swap first unsorted element with current element
				int temp = arr[wall];
				arr[wall] = arr[current];
				arr[current] = temp;
				// move wall to the left
				wall++;
			}
			current++;
		}
		this.bigOhCompare += 3;
		
		this.bigOhChange++;
		// swap pivot with first unsorted element
		arr[pivotPointer] = arr[wall];
		arr[wall] = pivot;
		
		
		
		// only do left quicksort if there is a left sublist
		if (wall != left) {
			quicksortWithWall(left, wall - 1);
		}
		// only do right quicksort if there is a right sublist
		if (wall != right) {
			quicksortWithWall(wall + 1, right);
		}
	}
	
	public void quicksortWithTwoPointers(int left, int right) {
		
		this.bigOhCompare++;
		if (right <= left)
			return;
		int high = right;
		int low = left;
		int pivotPointer = right;
		int pivot = arr[pivotPointer];
		
		this.bigOhCompare++;
		while(low <= high) {
			this.bigOhCompare++;
			while(arr[low] < pivot) {
				this.bigOhCompare++;
				low++;
			}
			this.bigOhCompare++;
			while(arr[high] > pivot) {
				this.bigOhCompare++;
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				bigOhChange++;
				low++;
				high--;
			}
			this.bigOhCompare++;
		}
	
		this.bigOhCompare += 2;
		
		if (low < right) {
			quicksortWithTwoPointers(low, right);
		}
		
		if (left < high) {
			quicksortWithTwoPointers(left, high);
		}
	
	}
}
