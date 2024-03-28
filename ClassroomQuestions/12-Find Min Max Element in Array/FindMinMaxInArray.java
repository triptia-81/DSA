package myjava.dsa;

// https://www.enjoyalgorithms.com/blog/find-the-minimum-and-maximum-value-in-an-array/
// https://www.geeksforgeeks.org/problems/max-min/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

public class FindMinMaxInArray {

	// Approach1 - Brute force solution using single loop
	public static int findSumApproach1(int A[], int N) {
		if (A != null && A.length > 0) {
			int min = A[0], max = A[0];

			for (int i = 1; i < N; i++) {
				if (A[i] < min)
					min = A[i];
				else if (A[i] > max)
					max = A[i];
			}

			return (min + max);
		}
		return 0;
	}
	
	// Approach2 - Divide and conquer like merge sort
	public static int findSumApproach2(int A[], int N) {
		return 0;
	}

	// Approach3 - Efficient approach using single loop increment by 2
	public static int findSumApproach3(int A[], int N) {
		int min = 0, max = 0, i = 0;
		if (A != null && A.length > 0) {
			if (N % 2 != 0) {
				min = A[0];
				max = A[0];
				i = 1;
			} else {
				if (A[0] > A[1]) {
					max = A[0];
					min = A[1];
				} else {
					max = A[1];
					min = A[0];
				}
				i = 2;
			}
			while (i < N) {
				if (A[i] > A[i + 1]) {
					if (A[i] > max)
						max = A[i];
					if (A[i + 1] < min)
						min = A[i + 1];

				} else {
					if (A[i + 1] > max)
						max = A[i + 1];
					if (A[i] < min)
						min = A[i];
				}
				i = i + 2;
			}
		}
		return (min + max);
	}

	public static void main(String[] args) {
		int A1[] = {-2, 1, -4, 5, 3};
		int A2[] = {1, 3, 4, 1};
		
		System.out.println(findSumApproach1(A1, A1.length));
		System.out.println(findSumApproach3(A2, A2.length));
	}

}
