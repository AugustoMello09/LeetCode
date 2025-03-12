package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {

		int[] numeros = { 0, 1, 0, 3, 12 };

		moveZeroes(numeros);

	}

	public static void moveZeroes(int[] nums) {

		int esquerda = 0;

		for (int direita = 0; direita < nums.length; direita++) {

			if (nums[direita] != 0) {
				int temp = nums[esquerda];
				nums[esquerda] = nums[direita];
				nums[direita] = temp;
				esquerda++;
			}
		}

	}

}
