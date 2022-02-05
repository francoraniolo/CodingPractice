package Practica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidAnagram {


    //SOLUCION: Se podia usar un array de enteros de tamaño 26 (cantidad de caracteres)
    //          luego sumar con s y restar con t en el index array[s.charat(i) - 'a']

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> map= new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
           map.put(t.charAt(i),map.getOrDefault(t.charAt(i), 0)-1);
        }

        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue()!=0){
                return false;
            }
        }

        return true;
    }
}
