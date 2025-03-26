package leetcode;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numeros = {-1,0,3,5,9,12};
		int alvo = 9;
		
		System.out.println(search(numeros, alvo));
	}

	public static int search(int[] nums, int target) {
		int esq = 0;
		int dir = nums.length - 1;
		
		while (esq <= dir) {
			
			int meio = esq + (dir - esq) / 2;
			
			if(nums[meio] == target) {
				return meio;
			} else if (nums[meio] > target) {
				dir = meio - 1;
			} else {
				esq = meio + 1;
			}
		}
		
		return -1;
	}

}
