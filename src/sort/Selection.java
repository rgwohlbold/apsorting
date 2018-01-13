package sort;

public class Selection extends Sort {

	@Override
	public int[] sort(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (j = i + 1; j < arr.length; j++) {
				bigOhCompare++;
				if (arr[min] > (arr[j])) {
					min = j;
				}
			}
			bigOhChange++;
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		return arr;
	}
}
