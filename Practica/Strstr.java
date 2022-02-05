package Practica;

import java.util.Locale;

public class Strstr {
    public int strStr(String haystack, String needle) {

        //SI SE PUEDE USAR INDEXOF USAR ESO, LO MISMO CON SUBSTRING

        if(needle.length()==0) return 0;

        if(needle.length()>haystack.length()) return -1;

        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j;
                for(j=1;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                        break;
                }

                if(j==needle.length()) return i;
            }

        }


        return -1;

    }
}
