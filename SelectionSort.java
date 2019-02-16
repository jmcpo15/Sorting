import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {64, -25, 12, 22, 11};
		
		sort(array);
		
		System.out.println(Arrays.toString(array));
	}

	
	public static Integer[] sort(Integer[] array) {
		
		//Move the boundary each time an element has been sorted
		for(int i = 0; i < array.length; i++) {
			
			//Find the min value
			int min = i;
			for(int j = i; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			
			//Swap the min value with the first element
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
}
