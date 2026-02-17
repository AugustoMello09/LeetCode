public class ValidPalindromeDois {

	public static void main(String[] args) {
		
		String testePalindrome = "abc";
		System.out.println(isPalindrome(testePalindrome));

	}

	public static boolean isPalindrome(String s) {
		int esquerda = 0;
		int direita = s.length() - 1;

		while (esquerda < direita) {
			if (s.charAt(esquerda) != s.charAt(direita)) {
				return verifica(s, esquerda + 1, direita) || verifica(s, esquerda, direita - 1);
			}
			esquerda++;
			direita--;
		}
		return true;
	}

	private static boolean verifica(String s, int esquerda, int direita) {
		while (esquerda < direita) {
			if (s.charAt(esquerda) != s.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
	}

}
