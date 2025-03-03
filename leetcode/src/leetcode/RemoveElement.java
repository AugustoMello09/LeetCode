package leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] valores = {3,2,2,3};
		System.out.println(removeElement(valores, 3));

	}

	public static int removeElement(int[] nums, int val) {
		int index = 0;
		
		for(int posicao = 0; posicao < nums.length; posicao++) {
		
			if(nums[posicao] != val) {
				nums[index] = nums[posicao];
				index++;
			}
		}
		
		return index;
	}

}
