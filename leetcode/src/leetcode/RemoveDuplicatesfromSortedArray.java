package leetcode;

public class RemoveDuplicatesfromSortedArray {
	
	public static void main(String[] args) {

		int[] numeros = { 0,0,1,1,1,2,2,3,3,4 };
		System.out.println(removeDuplicates(numeros));

	}

	public static int removeDuplicates(int[] nums) {
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i - 1]) {
 				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}

}
