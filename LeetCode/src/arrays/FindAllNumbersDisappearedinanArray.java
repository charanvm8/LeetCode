package arrays;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> resultList=new LinkedList<Integer>();
		
        if(nums==null || nums.length==0) {
			return resultList;
		}
		for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] =-nums[val];
            }
        }
		for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
            	resultList.add(i+1);
            }
        }
        return resultList;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer> numList=findDisappearedNumbers(nums);
		for(Integer i:numList) {
			System.out.println(i);
		}
	}
}
