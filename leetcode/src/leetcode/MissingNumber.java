package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] vetor = {3,0,1};
		System.out.println(missingNumber(vetor));
	}

	public static int missingNumber(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		int n = nums.length;
		
		for(int num : nums) {
			set.add(num);
		}
		
		for(int i = 0; i <= n; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		
		return -1;
	}

}
