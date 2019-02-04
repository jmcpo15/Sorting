import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		//Unsorted array
		Integer[] array = new Integer[] {4,3,1,10,12,6,9,8};
		//System.out.println(Arrays.toString(array));
		
		sort(array);
		//System.out.println("SORT");

		//System.out.println("[0, 1, 2,  3,  4, 5, 6, 7]");
		System.out.println(Arrays.toString(array));
	}
	
	
	public static Integer[] sort(Integer[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				int slot = place(arr, i);
				//insert(arr, i, slot);
			}
		}
		return arr;
	}
	
	public static int place(Integer[] arr, int no) {
		int find = 0;
		while(arr[no-find] > arr[no]) {
			find ++;
		}
		System.out.println(no-find+1);
		return no-find+1;
	}
	
	//Function to insert the chosen number into the correct slot in the array, 
	//by providing the array, the index the number to be changed and the index which
	//the number is going to be placed into
	public static Integer[] insert(Integer[] arr, int init, int slot) {
		int temp = arr[init];
		while(init < slot) {
			System.out.println(init-1);
			arr[init] = arr[init-1];
			init --;
		}
		if(init == slot) {
			arr[init] = temp;
		}
		return arr;
	}
}