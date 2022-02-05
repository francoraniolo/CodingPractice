package Practica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result= new ArrayList<>();

        HashSet<Integer> set= new HashSet<>();


        for(int i=0;i< strs.length;i++){
            ArrayList<String> list= new ArrayList<>();
            if(set.add(i)){
                list.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(isAnagram(strs[i],strs[j])){
                    set.add(j);
                    list.add(strs[j]);
                    }
                }
                result.add(list);
            }
        }

        return result;
    }

    private boolean isAnagram(String s1, String s2){

        if(s1.length()!=s2.length()) return false;

        int[] chars=new int[26];

        for(int i=0;i<s1.length();i++){
            chars[s1.charAt(i)-'a']++;
            chars[s2.charAt(i)-'a']--;
        }

        for(int e:chars){
            if(e!=0) return false;
        }

        return true;
    }
}
