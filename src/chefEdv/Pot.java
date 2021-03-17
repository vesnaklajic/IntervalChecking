package chefEdv;

import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// number of boils
		int n = sc.nextInt();
		// array of intervals limits, a&b
		int[][] seconds = new int[n][2];

		// enter interval seconds into array
		for (int i = 0; i < n; i++) {
			seconds[i][0] = sc.nextInt();
			seconds[i][1] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			int beginInterval = seconds[i - 1][0];
			int endInterval = seconds[i - 1][1];
			if (beginInterval < seconds[i][0] && seconds[i][0] < endInterval) {
				if (beginInterval < seconds[i][1] && seconds[i][1] < endInterval)
					System.out.println("gunilla has a point");
			} else
				System.out.println("edward is right");
		}

	}// PSVM
}
