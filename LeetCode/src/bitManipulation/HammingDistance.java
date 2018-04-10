package bitManipulation;

public class HammingDistance {
	public static int hammingDistance(int x, int y) {
		int z=x^y;
		int counter=0;
		while(z>0) {
			z=(z&z-1);
			counter+=1;
		}
        return counter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=4;
		System.out.println(hammingDistance(x, y));
	}

}
