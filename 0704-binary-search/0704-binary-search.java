class Solution {

    public int Bs(int[] nums, int target,int s,int e) {
        if(s>e){
           return -1; 
        }
        int m =s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(target<nums[m]){
            return Bs(nums,target,s,(m-1));
        }
        return Bs(nums,target,(m+1),e);
    }


    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        
        return Bs(nums,target,s,e);
    }
}