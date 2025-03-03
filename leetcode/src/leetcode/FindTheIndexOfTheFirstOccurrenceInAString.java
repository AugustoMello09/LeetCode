package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
	
	public static void main(String[] args) {
		
		System.out.println(strStr("sadbutsad", "sad"));
		
	}
	
	public static int strStr(String haystack, String needle) {
		int firstOccurrence = 0;
		for(int posicao = 0; posicao < haystack.length(); posicao++) {
        	if(haystack.contains(needle)) {
        		return firstOccurrence = haystack.indexOf(needle);
        	} 
  
        }
		return -1;
    }

}
