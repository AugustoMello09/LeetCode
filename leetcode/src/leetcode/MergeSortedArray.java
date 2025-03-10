package leetcode;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] numeros1 = {0};
		int[] numeros2 = {1};
		merge(numeros1, 0, numeros2, 1);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ultimoNumeroValidoNoArrayUm = m - 1;
		int ultimoNumeroValidoNoArrayDois = n - 1;
		int ultimaPosicaoDisponivel = m + n - 1;
		
		while (ultimoNumeroValidoNoArrayUm >= 0 && ultimoNumeroValidoNoArrayDois >= 0 ) {
			
			if(nums1[ultimoNumeroValidoNoArrayUm] > nums2[ultimoNumeroValidoNoArrayDois]) {
				
				nums1[ultimaPosicaoDisponivel] = nums1[ultimoNumeroValidoNoArrayUm];
				
				ultimoNumeroValidoNoArrayUm--;
			} else {
				
				nums1[ultimaPosicaoDisponivel] = nums2[ultimoNumeroValidoNoArrayDois];
				
				
				ultimoNumeroValidoNoArrayDois--;
			}
			
			 ultimaPosicaoDisponivel--;
			
		}
		
		while (ultimoNumeroValidoNoArrayDois >= 0) {
		    nums1[ultimaPosicaoDisponivel] = nums2[ultimoNumeroValidoNoArrayDois];
		    ultimoNumeroValidoNoArrayDois--;
		    ultimaPosicaoDisponivel--;
		}
	}

}
