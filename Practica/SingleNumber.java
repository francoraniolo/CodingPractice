package Practica;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> numbers= new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(!numbers.containsKey(nums[i])){
                numbers.put(nums[i],0);
            }else{
                numbers.replace(nums[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> e: numbers.entrySet()){
            if(e.getValue()==0) return e.getKey();
        }


       return 0;
    }
}
