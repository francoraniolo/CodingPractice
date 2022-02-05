package Practica;

import java.awt.*;

public class CountAndSay {
    public String countAndSay(int n) {

        if(n==1) return "1";

        String ans="1";

        for(int i=1;i<n;i++){
            ans=countandSay(ans);
        }

        return ans;

    }

    private String countandSay(String ans){


        StringBuilder result=new StringBuilder();
        char lastCharacter=ans.charAt(0);
        int counter=1;

        for(int i=1;i<ans.length();i++){
            if(ans.charAt(i)==lastCharacter)
                counter++;
            else{
                result.append(counter);
                result.append(lastCharacter);

                counter=1;
                lastCharacter=ans.charAt(i);
            }
        }

        result.append(counter);
        result.append(lastCharacter);

        return result.toString();

    }
}
