package leetcode;

public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
	}

	public static int arrangeCoins(int n) {
		 int linha = 0;
		 
		 while (n > linha) {
			linha++;
			n -= linha;
			
		}
		 
		return linha;
		
	}

}
