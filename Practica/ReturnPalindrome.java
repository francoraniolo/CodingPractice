package Practica;

public class ReturnPalindrome {
    public String returnPalindrome(String text){

        int l=0;
        int r=text.length()-1;

        String result="";

        while(l<text.length()/2){
            if(text.charAt(l)=='?'){
                if(text.charAt(r-l)=='?'){
                    result=result+'a';
                }else{
                    result=result+text.charAt(r-l);
                }
            }else{
                if(text.charAt(r-l)!='?') {
                    if (text.charAt(l) != text.charAt(r - l)) return "NO";
                    else {
                        result = result + text.charAt(l);
                    }
                }else{
                    result = result+text.charAt(l);
                }
            }

            l++;

            System.out.println("result en bucle "+ l +" : "+result);
        }



        int index=(text.length()/2)-1;

        if(text.length()%2!=0){
            if(text.charAt(l)=='?'){
                result=result+'a';
            }else{
                result=result+text.charAt(l);
            }
        }

        while(index>=0){
            result=result+result.charAt(index);
            index--;
        }

        return result;
    }
}
