package Practica;

public class ShortestUnsortedContinuosSubarray {
    public int findUnsortedSubarray(int[] nums) {

        if(nums.length<=1) return 0;

        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        boolean flag=false;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                flag=true;
            }

            if(flag){
                min=Math.min(min,nums[i]);
            }
        }

        if(!flag) return 0;

        flag=false;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                flag=true;
            }

            if(flag){
                max=Math.max(max,nums[i]);
            }
        }

        int left;

        for(left=0;left<nums.length;left++){
            if(nums[left]>min){
                break;
            }
        }

        int right;

        for(right=nums.length-1;right>=0;right--){
            if(nums[right]<max){
                break;
            }
        }


        return right-left<0?0:right-left+1;

    }
}
