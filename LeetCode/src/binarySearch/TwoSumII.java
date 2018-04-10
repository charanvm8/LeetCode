package binarySearch;

public class TwoSumII {
	
	public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int size=numbers.length;
        int start=0;
        int mid=start+(start-size/2);
        int diff=target-mid;
        if(diff>mid){
        	BinarySearchForInt(numbers,mid+1,size,diff);
        }else{
        	BinarySearchForInt(numbers, 0, mid-1, diff);
        }
        
        return result;
    }
	
	public int BinarySearchForInt(int[] nums,int x,int y,int result){
		if(y>=x){
			int mid=x+(y-x)/2;
			if(nums[mid]==result){
				return mid;
			}
			if(result>nums[mid]){
				return BinarySearchForInt(nums, mid+1, y, result);
			}else{
				return BinarySearchForInt(nums, x, mid-1, result);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=new int[2];
		result[0]=5;
		result[1]=6;
		
	}

}
