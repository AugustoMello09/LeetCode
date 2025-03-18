package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		int[] numeros1 = {4,9,5};
		int[] numeros2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersect(numeros1, numeros2)));

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> interse = new ArrayList<Integer>();
		Map<Integer, Integer> frequencia = new HashMap<Integer, Integer>();
		
		for(int numero : nums1) {
			frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
		}
		
		for(int numero : nums2) {
			 
			 if(frequencia.getOrDefault(numero, 0) > 0) {
				 interse.add(numero);
				 frequencia.put(numero, frequencia.get(numero) - 1);
			 }
		}
		
		return interse.stream().mapToInt(x -> x.intValue()).toArray();
	}

}
