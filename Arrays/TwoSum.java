package ArrayManipulation;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		TwoSumCode tsc = new TwoSumCode();

		int[] numbers = { 2, 7, 11, 15 };

		int target = 9;

		printArray(tsc.twoSum(numbers, target));

	}

	private static void printArray(int[] twoSum) {
		for (int i : twoSum) {
			System.out.println("index = "+i);
		}

	}

}

class TwoSumCode {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		return result;
	}
}