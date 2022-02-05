package Practica;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if(nums.length<=1) return false;

        boolean duplicate=false;

        HashSet<Integer> numbers=new HashSet<Integer>();

        numbers.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if (numbers.contains(nums[i])){
                return true;
            }else{
                numbers.add(nums[i]);
            }
        }



        return false;
    }

}
