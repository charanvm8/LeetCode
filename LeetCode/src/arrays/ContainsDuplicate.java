package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums==null) {
        	return false;
        }
        Set<Integer> numsContains=new HashSet<Integer>();
        Boolean numfound=false;
        for(int i:nums) {
        	if(numsContains.contains(i)) {
        		numfound=true;
        		return numfound;
        	}
        	else {
        		numsContains.add(i);
        	}
        }
        return numfound;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6};
		int[] nums1= {1,2,3,4,5,6,1};
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(nums1));
	}

}
