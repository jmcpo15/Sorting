import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		//Unsorted array
		Integer[] array = new Integer[] {4,3,1,10,12,6,9,8};
		//System.out.println(Arrays.toString(array));
		
		sort(array);
		//System.out.println("SORT");

		System.out.println("[0, 1, 2,  3,  4, 5, 6, 7]");
		System.out.println(Arrays.toString(array));
	}
	
	
	public static Integer[] sort(Integer[] arr) {

		if(arr[5] < arr[4]) {
			System.out.println(place(arr, 5));
			//insert(arr, slot);
		}
		return null;
	}
	
	public static int place(Integer[] arr, int no) {
		int find = 1;
		while(arr[no-find] > arr[no]) {
			find ++;
		}
		
		return no-find+1;
	}
	
	public static Integer[] insert(Integer[] arr, int init, int slot) {
		int temp = init;
		return null;
	}
}