package leetcode;

public class FirstBadVersion {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
	}

	public static int firstBadVersion(int n) {

		int esquerda = 1;
		int direita = n;

		while (esquerda < direita) {

			int meio = esquerda + (direita - esquerda) / 2;
			
			if(isBadVersion(meio)) {
				direita = meio;
			} else {
				esquerda = meio + 1;
			}

		}

		return esquerda;
	}
	
	 public static boolean isBadVersion(int version) {
		 return true;
	 }

}
