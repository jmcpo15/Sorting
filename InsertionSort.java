import java.util.Arrays;

/*An implementation in Java of the Insertion Sort, this is a sorting
 * algorithm where the integers are transferred one at a time to 
 * the right position. It does this by comparing it to the element directly
 * to the left of it and then finding where in the 'sorted array' it will fit.
 * The integer will then be inserted into the correct position. This is 
 * done for all integers in the array.  */

public class InsertionSort {
	
	public static void main(String[] args) {
		//Unsorted array
		Integer[] array = new Integer[] {4,3,1,10,12,6,9,8};
		//[1,3,4,10,12,6,...]
		
		sort(array);
		
		//Print sorted array
		System.out.println(Arrays.toString(array));
	}
	
	
	public static Integer[] sort(Integer[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				insert(arr, i, findLocation(arr, i));
			}
		}
		return arr;
	}
	
	//Function to find where the integer fits in the sorted array.
	public static int findLocation(Integer[] arr, int index) {
		int find = 1;
		while(arr[index] < arr[index-find]) {
			if(index-find == 0) {
				return 0;
			}
			find ++;
		}
		return index-find+1;
	}
	
	
	//Function to insert the integer into the correct location in the array.
	public static Integer[] insert(Integer[] arr, int NumberToChange, int TargetLocation) {
		int temp = arr[NumberToChange];
		while(NumberToChange >= TargetLocation) {
			if(NumberToChange == TargetLocation) {
				arr[NumberToChange] = temp;
				break;
			} else {
				arr[NumberToChange] = arr[NumberToChange-1];
				NumberToChange --;
			}
		}
		return arr;
	}
}