package arrays;

public class LargestNumberTwice {
	public static int dominantIndex(int[] nums) {
		if(nums==null) {
			return -1;
		}
		int largestNumber=0;
		int largIndex=0;
		int secondLargestNumber=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largestNumber) {
				int temp=largestNumber;
				largestNumber=nums[i];
				secondLargestNumber=temp;
				largIndex=i;
			}
			else if(nums[i]>secondLargestNumber) {
				secondLargestNumber=nums[i];
			}
		}
		return largestNumber>=(secondLargestNumber*2)?largIndex:-1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3, 6, 1, 0};
		System.out.println(dominantIndex(nums));
	}

}
