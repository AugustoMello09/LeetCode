package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {

	public static void main(String[] args) {

		int[] numeros = { 4,1,4,0,3,5 };
		System.out.println(distinctAverages(numeros));

	}

	public static int distinctAverages(int[] nums) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums);
		int esquerda = 0;
		int direita = nums.length - 1;
		while (esquerda < direita) {
			int soma = (nums[esquerda] + nums[direita]);
			set.add(soma);
			esquerda++;
			direita--;
		}
			
		return set.size();
	}

}
