package bitManipulation;

public class BinaryNumberwithAlternatingBits {
	public static boolean hasAlternatingBits(int n) {
        int x=~n;
        System.out.println(x^n);
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(hasAlternatingBits(n));
	}

}
