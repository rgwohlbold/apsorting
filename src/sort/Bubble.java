package sort;

public class Bubble extends Sort {

	@Override
	public int[] sort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				bigOhCompare++;
				if (arr[j] > arr[j+1]) {
					bigOhChange++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
