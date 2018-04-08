package arrays;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		if(nums==null || nums.length==0) {
			return;
		}
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				j++;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0, 1, 0, 3, 12};
		moveZeroes(nums);
		for(int i:nums) {
			System.out.println(i);
		}
	}

}
