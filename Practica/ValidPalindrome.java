package Practica;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {


        if(s.length()<=1) return true;

        String slowercase=s.toLowerCase();

        int index1,index2;

        index1=0;
        index2=slowercase.length()-1;

        char ini,fin;


        ini=slowercase.charAt(index1);
        fin=slowercase.charAt(index2);

        while(index1<index2){


           ini=slowercase.charAt(index1);
           fin=slowercase.charAt(index2);

           if((ini>='a' && ini<='z') || (ini>='0' && ini<='9')){
               if((fin>='a' && fin<='z') || (fin>='0' && fin<='9')){
                   if(ini!=fin) return false;
                   else{
                       index1++;
                       index2--;
                   }
               }else{
                   index2--;
               }
           }else{
               index1++;
           }
        }



        return true;
    }
}
