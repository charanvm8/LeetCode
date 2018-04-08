package arrays;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        int maxNumber=Integer.MIN_VALUE;
        int counter=0;
        for(int i:nums){
            if(i==1) {
            	counter+=1;
            }
            else {
            	if(counter>maxNumber) {
            		maxNumber=counter;
            	}
                counter=0;
            }
        }
        return counter>maxNumber?counter:maxNumber;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
