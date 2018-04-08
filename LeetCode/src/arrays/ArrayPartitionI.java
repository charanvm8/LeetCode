package arrays;

import java.util.Arrays;

public class ArrayPartitionI {
	public static int arrayPairSum(int[] nums) {
        if(nums.length==0 || nums==null || nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int minTotal=0;
        for(int i=0;i<nums.length;i+=2) {
        	minTotal+=nums[i];
        }
        return minTotal;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,4,3,2};
		System.out.println(arrayPairSum(nums));
	}

}
