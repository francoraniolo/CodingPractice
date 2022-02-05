package Practica;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        //SOLUCION https://leetcode.com/problems/longest-substring-without-repeating-characters/solution

        int longestSub=0;
        StringBuilder actualSub=new StringBuilder();

        int i=0;

        while(i<s.length()){
            if(!actualSub.toString().contains(""+s.charAt(i))){
                if(actualSub.toString().length()>longestSub){
                    longestSub=actualSub.toString().length();
                }
                actualSub.delete(0,actualSub.toString().indexOf(s.charAt(i))+1);
                actualSub.append(s.charAt(i));
            }else{
                actualSub.append(s.charAt(i));
            }
            i++;
        }

        if(actualSub.toString().length()>longestSub){
            longestSub=actualSub.toString().length();
        }

        return longestSub;
    }
}
