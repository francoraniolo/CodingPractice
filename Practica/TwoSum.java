package Practica;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if(nums.length==0) return new int[0];
        if(nums.length==1) return new int[1];

        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();

        map.put(nums[0],0);

        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int secondKey = map.get(target-nums[i]);

                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return new int[] {0,0};
    }


}
