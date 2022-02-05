package Practica;

public class Ejercicio {

    public int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        int counter=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[counter++]=nums[i];
            }
        }

        return counter;
    }

}
