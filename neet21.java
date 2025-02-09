// leetcode 20 
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); // to access through the given string 
            if(!mp.containsKey(c)){ // contains.Key() functions checks whether the given key in the function is there in the hash map or not
                st.push(c);
            } // here in the above , as we have to push the opening brackets into the stack while iterating thorugh the given string, so as the keys in the map are only closed 
            // the  if(!mp.containsKey(c)) this ensures if the char c is only the opening bracket then only push that into stack.
            else{
                if(st.isEmpty()){
                    return false;
                } // while popping the element from the stack when we got the closing bracket while iterating through the given string , we are ensuring the stack is not empty before popping from the stack.
                char topelement= st.pop();
                if(topelement!=mp.get(c)){ // .get(key) function gets the associated value from the hashmap  of the given key in the function.
                    return false;
                }
            }
        }
        return st.isEmpty(); // as after our iteration , the stack should be empty , we are checking that 
    


        
    }
}