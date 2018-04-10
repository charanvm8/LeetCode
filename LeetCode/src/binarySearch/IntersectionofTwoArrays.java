package binarySearch;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> intList=new HashSet<Integer>();
		Set<Integer> resultant=new HashSet<Integer>();
        for(int i:nums1){
        	intList.add(i);
        }
        for(int i:nums2){
        	if(intList.contains(i)){
        		resultant.add(i);
        	}
        }
        for(Integer i:resultant){
        	System.out.println(i);
        }
        int[] result=new int[resultant.size()];
        int z=0;
        for(Integer i:resultant){
        	result[z++]=i;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1, 2, 2, 1};
		int[] nums2={2,2,1};
		int[] result=intersection(nums1, nums2);
		for(int i:result){
			System.out.println(i);
		}
	}

}
