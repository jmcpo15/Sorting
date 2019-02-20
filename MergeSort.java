import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {38, 27, 43, 3, 9, 82};

		sort(array, 0, array.length-1);

		System.out.println(Arrays.toString(array));
	}

	public static Integer[] sort(Integer[] array,int first,int last) {
		if(first < last) {
			int middle = (first+last)/2;

			sort(array, first, middle);
			sort(array, middle+1, last);

			merge(array, first, middle, last);
		}
		return array;
	}

	public static Integer[] merge(Integer[] array, int first, int middle, int last) {
		int lengthL = middle - first + 1;
		int lengthR = last - middle;

		int[] Left = new int[lengthL];
		int[] Right = new int[lengthR];

		for(int i = 0; i < lengthL; i++) {
			Left[i] = array[first + i];
		}
		for(int j = 0; j < lengthR; j++) {
			Right[j] = array[middle + 1 + j];
		}

		int i =0;
		int j = 0;
		int k = first;

		while(i < lengthL && j < lengthR) {

			if(Left[i] < Right[j]) {
				array[k] = Left[i];
				i++;
			} else {
				array[k] = Right[j];
				j++;
			}
			k++;
		}

		while(i < lengthL) {
			array[k] = Left[i];
			i++;
			k++;
		}

		while(j < lengthR) {
			array[k] = Right[j];
			j++;
			k++;
		}

		return array;
	}
}
