package Practica;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        //SOLUCION OPTIMA https://www.youtube.com/watch?v=qJSPYnS35SE

        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums.length<3) return result;

        HashMap<Integer,Integer> map= new HashMap<>();


        for(int k=0;k< nums.length;k++){
            map.put(nums[k],k);
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(-(nums[i]+nums[j]))){
                    int h=map.get(-(nums[i]+nums[j]));
                    if(h!=i && h!=j && h>j) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[h]);
                        Collections.sort(list);
                        if(!result.contains(list))
                        result.add(list);
                    }
                }
            }
        }

        return result;
    }
}
