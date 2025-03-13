package leetcode;

public class SearchInsertPosition {
	
	public static void main(String[] args) {
		
		int[] numeros = {1,3,5,6};
		
		System.out.println(searchInsert(numeros, 7));
		
	}
	
	public static int searchInsert(int[] nums, int target) {

        int esquerda = 0;
        int direita = nums.length - 1;
        
        while (esquerda <= direita) {

			int meio = esquerda + (direita - esquerda) / 2; 
			  
			if(nums[meio] == target) {
				return meio;			
			
			} else if (nums[meio] < target) {
				esquerda = meio + 1;
			
			} else {
				direita = meio - 1;
			}
		}
        return esquerda;
    }

}
