package sort;

import java.util.LinkedList;
import java.util.List;

public abstract class Sort {

	public int bigOhCompare = 0;
	public int bigOhChange = 0;
	
	public abstract int[] sort(int[] arr);
	
	public static int[] shuffle(int[] arr) {
		List<Integer> list = new LinkedList<>();
		for (int i : arr)
			list.add(i);
		
		int[] newarr = new int[arr.length];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = list.remove((int)(Math.random() * list.size()));
		}
		return newarr;
	}
	
	public static boolean isSorted(int[] arr) {
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < prev)
				return false;
			prev = arr[i];
		}
		return true;
	}
}
