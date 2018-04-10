package bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
	     Set<Integer> resultNum=new HashSet<Integer>();
	     for(int i:nums) {
	    	 if(resultNum.contains(i)) {
	    		 resultNum.remove(i);
	    	 }else {
	    		 resultNum.add(i);
	    	 }
	     }
	     return resultNum.iterator().next();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,5,4,5,6,6,3};
		System.out.println(singleNumber(nums));
	}

}
