package Practica;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        int min=Integer.MAX_VALUE;

        if(strs.length==1) return strs[0];

        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0) return "";

            min=Math.min(min,strs[i].length());
        }

        StringBuilder sv= new StringBuilder();

        char character;

       for(int j=0;j<min;j++){
           character=strs[0].charAt(j);
           for(int l=1;l<strs.length ;l++){
                if(strs[l].charAt(j)!=character){
                    return sv.toString();
                }
           }
           sv.append(character);
       }

       return sv.toString();
    }
}
