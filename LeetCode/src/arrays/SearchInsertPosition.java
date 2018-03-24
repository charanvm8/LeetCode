package arrays;

public class SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
        if(nums.length==0 || nums==null || target<nums[0]){
            return 0;
        }
        int position=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target) {
            	return i;
            }
            else if(target<nums[i]){
                return position;
            }
            else{
            	position++;
            }
        }
        return target==nums[position]?position:++position;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3};
		System.out.println(searchInsert(arr,2));
		
	}

}
