package sort;

import java.util.LinkedList;
import java.util.List;

public abstract class Sort {

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
}
