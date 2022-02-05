package Practica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrayII {

    //AGREGADO A FAVORITOS, CON HASHMAP

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int[] arr = new int[Integer.min(nums1.length,nums2.length)];

        int[] arr2 = new int[Integer.max(nums1.length, nums2.length)];

        if(nums1.length<=nums2.length) {
            arr=nums1;
            arr2=nums2;
        }
        else {
            arr=nums2;
            arr2=nums1;
        }


        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        ArrayList<Integer> list= new ArrayList<Integer>();

        for(int j=0;j<arr2.length;j++){
            map.put(arr2[j], map.getOrDefault(arr2[j],0)-1);
            if(map.get(arr2[j])>=0)
                list.add(arr2[j]);
        }

        int[] result = new int[list.size()];
        for (int i=0 ; i <list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


}
