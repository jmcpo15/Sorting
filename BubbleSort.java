import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		//Unsorted array
		Integer[] array = new Integer[] {12,13,24,10,3,6,90,70};
		System.out.println(Arrays.toString(array));
		
		sort(array);
		System.out.println("SORT");
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static Integer[] sort(Integer[] arr) {
		int len = arr.length;
		boolean out = true;
		
		for(int x = 0; x < len - 1; x++) {
			int y = x + 1;
			if(compare(arr, x, y) == true) {
				swap(arr, x, y);
				out = false;
			}
		}
		
		if(out == false) {
			sort(arr);
		}
		
		return arr;
	}
	
	public static Integer[] swap(Integer[] arr, int x, int y) {
		int temp = 0;
		temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
		return arr;
	}
	
	public static boolean compare(Integer[] arr, int left, int right) {
		if(arr[left] < arr[right] || arr[left] == arr[right]) {
			return false;
		} else if(arr[left] > arr[right]) {
			return true;
		}
		return false;		
	}
}
