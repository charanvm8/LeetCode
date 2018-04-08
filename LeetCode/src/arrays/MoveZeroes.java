package arrays;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		if(nums.length<2 || nums==null) {
			return;
		}
        int zeroPos=0;
        Boolean numFound=true;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0 && numFound) {
        		numFound=false;
        		zeroPos=i;
        	}
        	else if(nums[i]!=0){
        		numFound=true;
        		nums[zeroPos]=nums[i];
        		nums[i]=0;
        		i=zeroPos;
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
