package Practica;

public class MyAtoi {
    public int myAtoi(String s) {


        //SOLUCION https://leetcode.com/problems/string-to-integer-atoi/solution/

        boolean numbers=false;

        int index=0;
        String numberStr="";

        while(index<s.length()){
            if(s.charAt(index)==' '){
                if(numbers) index=s.length();
                else{
                    index++;
                }
            }else{
                if((s.charAt(index)>='0') && (s.charAt(index)<='9')){
                    if(!numbers) numbers=true;
                    numberStr=numberStr+s.charAt(index);
                    index++;
                }else{
                    if(s.charAt(index)=='-'){
                        if(numbers) index=s.length();
                        else{
                            numbers=true;
                            numberStr=numberStr+'-';
                            index++;
                        }
                    }else{
                        if(numbers) index=s.length();
                        else{
                            if(s.charAt(index)=='+'){
                                if(index>0) {
                                    if ((s.charAt(index - 1)) == '-' || s.charAt(index - 1) == '+') index = s.length();
                                    else {
                                        numbers = true;
                                        index++;
                                    }
                                }else{
                                    numbers=true;
                                    index++;
                                }
                            }else{
                                index=s.length();
                            }
                        }
                    }
                }
            }
        }

        if(numberStr.length()==0) return 0;

        if((numberStr.length()==1) && numberStr.charAt(0)=='-') return 0;



        int start=0;

        if(numberStr.charAt(0)=='-'){
            start++;
        }

        int number=0;

        for(int i=start;i<numberStr.length();i++){
            if(number>(Integer.MAX_VALUE/10)){
                if(start==0) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }

            if(number==(Integer.MAX_VALUE/10)){
                if(start==0) {
                    System.out.println("HOLA");
                    if (getNumber(numberStr.charAt(i)) > (Integer.MAX_VALUE%10)) {
                        return Integer.MAX_VALUE;
                    }
                }else{
                    if (getNumber(numberStr.charAt(i)) == 9) {
                        return Integer.MIN_VALUE;
                    }
                }
            }
            number=number*10 + getNumber(numberStr.charAt(i));
        }

        if(start==1) return number*-1;

        return number;

    }

    private int getNumber(char c){
        switch (c){
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
        }
        return 0;
    }



}
