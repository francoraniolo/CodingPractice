package Practica;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==0) return true;


        Stack<Character> st= new Stack<>();

        int index=1;

        st.push(s.charAt(0));

        while(index<s.length()){
            if(s.charAt(index)=='(' || s.charAt(index)=='[' || s.charAt(index)=='{' ){
                st.push(s.charAt(index));
            }else{
               if(st.isEmpty()) return false;
               switch (s.charAt(index)){
                   case ')':{
                       if(st.peek()!='(') return false;
                       else break;
                   }
                   case ']':{
                       if(st.peek()!='[') return false;
                       else break;
                   }
                   case '}':{
                       if(st.peek()!='{') return false;
                       else break;
                   }
               }
               st.pop();

            }

            index++;
        }

        return st.isEmpty();
    }
}
