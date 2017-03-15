package MatrixManipulation;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SpiralMatrix {
	public static void main(String[] args) throws InterruptedException {
		int n = 6;

		int[][] box = new int[n][n];

		int upto = n;

		int val = 1;

		int s = 0;
		int e = -1;

		for (int i = 0; i < 2 * n - 1; i++) {

			if (i % 2 != 0)
				upto--;

			for (int j = 0; j < upto; j++) {
				if (i % 4 == 0)
					box[s][++e] = val++;
				else if (i % 4 == 1)
					box[++s][e] = val++;
				else if (i % 4 == 2)
					box[s][--e] = val++;
				else if (i % 4 == 3)
					box[--s][e] = val++;
			}

		}
		printMat(box);
	}

	private static void printMat(int[][] box) throws InterruptedException {
		for (int i = 0; i < box.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < box.length; j++) {
				if (box[i][j]<10)
					System.out.print("  "+box[i][j]+" |");
					else
					System.out.print(" "+box[i][j]+" |");
			}
			TimeUnit.SECONDS.sleep(1);
			System.out.println("");
			
		}
	}

}
