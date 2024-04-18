package myjava.dsa.dp;

import java.util.Arrays;

public class FibonacciSeriesDP {

	// Bottom up Approach
	public static int[] fibonacciUsingBottomUp(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp;
	}

	// Top down Approach
	public static int fibonacciUsingTopDown(int n, int dp[]) {
		if (n <= 1)
			dp[n] = n;
		else if (dp[n] < 1)
			dp[n] = fibonacciUsingTopDown(n - 1, dp) + fibonacciUsingTopDown(n - 2, dp);

		return dp[n];
	}

	public static void main(String[] args) {

		 int fibSeries[] = fibonacciUsingBottomUp(5);
		 System.out.println(Arrays.toString(fibSeries));

		int target = 8;
		int dp[] = new int[target+1];
		fibonacciUsingTopDown(8, dp);
		System.out.println(Arrays.toString(dp));

	}

}
