package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] numeros1 = {4,9,5};
		int[] numeros2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(numeros1, numeros2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> setUm = new HashSet<Integer>();
		
		for(int numero : nums1) {
			setUm.add(numero);
		}
		
		Set<Integer> setDois = new HashSet<Integer>();
		
		for(int i = 0; i < nums2.length; i++) {
			
			if(setUm.contains(nums2[i])) {
				setDois.add(nums2[i]);
			}
		}
		
		return setDois.stream().mapToInt(Integer::intValue).toArray();
	}

}
