package Practica;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){


            if(!map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),i);
           }else{
               map.replace(s.charAt(i), -1);
           }




        }




        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue()>=0) return e.getValue();
        }

        return -1;
    }

}
