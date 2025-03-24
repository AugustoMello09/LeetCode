package leetcode;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {

		char[] letras = { 'x', 'x', 'y' };
		char alvo = 'z';
		System.out.println(nextGreatestLetter(letras, alvo));
	}

	public static char nextGreatestLetter(char[] letters, char target) {

		for (char letra : letters) {
			if(letra > target) {
				return letra;
			}
		}
		
		return letters[0];

	}

}
