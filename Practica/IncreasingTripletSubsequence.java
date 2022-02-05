package Practica;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;

        int left=0;
        int right=nums.length-1;

        int min=nums[0];
        int max=nums[nums.length-1];

        while(left<right){
            if(nums[left]<min)
                min=nums[left];
            if(nums[right]>max)
                max=nums[right];
            if(min<nums[left] && nums[left]<max)
                return true;
            left++;
            right--;
        }

        return false;
    }
}
