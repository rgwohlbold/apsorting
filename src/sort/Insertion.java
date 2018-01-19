package sort;

public class Insertion extends Sort {

	@Override
	public int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int currentElement = arr[i];
			int j = i - 1;
			bigOhChange++;
			bigOhCompare += 2;
			while (j >= 0 && arr[j] > currentElement) {
				bigOhChange++;
				arr[j+1] = arr[j];
				j--;
			}
			bigOhChange++;
			arr[j+1] = currentElement;
		}
		return arr;
	}

}
