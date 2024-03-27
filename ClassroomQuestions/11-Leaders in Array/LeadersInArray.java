package myjava.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

	// Function to find the leaders in an array in primitive format.
	public static int[] findLeadersInPrimitiveFormat(int[] arr) {
		
		List<Integer> leaders = new ArrayList<Integer>();
		if (arr != null && arr.length > 0) {
			int max = arr[arr.length - 1];
			leaders.add(max);
			
			for (int i = arr.length - 2; i >= 0; --i) {
				if (arr[i] > max) {
					leaders.add(arr[i]);
				}
				max = Math.max(max, arr[i]);
			}
		}
		Collections.reverse(leaders);
		return leaders.stream().mapToInt(i -> i).toArray();
	}

	// Function to find the leaders in an array.
	static ArrayList<Integer> findLeaders(int arr[]) {
		
		ArrayList<Integer> leaders = new ArrayList<>();
		if (arr != null && arr.length > 0) {
			int max = arr[arr.length - 1];
			leaders.add(max);
			for (int i = arr.length - 2; i >= 0; i--) {
				if (arr[i] >= max) {
					leaders.add(arr[i]);
				}
				max = Math.max(max, arr[i]);
			}
			Collections.reverse(leaders);
		}
		return leaders;
	}

	public static void main(String[] args) {

		int A1[] = { 17, 18, 5, 4, 6, 1 };
		int A2[] = { 400 };
		int A3[] = { 16, 17, 4, 3, 5, 2 };
		int A4[] = { 6, 5, 4, 3, 2, 1 };
		int A5[] = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println(Arrays.toString(findLeadersInPrimitiveFormat(A1)));
		System.out.println(Arrays.toString(findLeadersInPrimitiveFormat(A2)));
		System.out.println(Arrays.toString(findLeadersInPrimitiveFormat(A3)));
		System.out.println(Arrays.toString(findLeadersInPrimitiveFormat(A4)));
		System.out.println(Arrays.toString(findLeadersInPrimitiveFormat(A5)));
		
		System.out.println(findLeaders(A1));
		System.out.println(findLeaders(A2));
		System.out.println(findLeaders(A3));
		System.out.println(findLeaders(A4));
		System.out.println(findLeaders(A5));
	}

}
