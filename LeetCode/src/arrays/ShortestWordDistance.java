package arrays;

public class ShortestWordDistance {
	public static int shortestDistance(String[] words, String word1, String word2) {
        int fstPos= -1;
        int sndPos= -1;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                fstPos=i;
            }
            if(words[i].equals(word2)){
                sndPos=i;
            }
            if(fstPos!=-1 && sndPos!=-1) {
            	diff=Math.min(diff, Math.abs(fstPos-sndPos));
            }
        }
        return diff;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stgs= {"a","a","b","b"};
		System.out.println(shortestDistance(stgs, "b", "a"));
	}
}
