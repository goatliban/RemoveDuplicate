import java.util.Stack;

public class Solution {
    public String removeDuplicate(String s) {
        Stack<Character> Stack = new Stack<>();
        for(int i =0; i < s.length(); i ++){
             char ch= s.charAt(i);
             if(!Stack.isEmpty() && Stack.peek() == ch){
                 Stack.pop();
             }
             else {
                 Stack.push(ch);
             }
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : Stack){
            result.append(ch);
        }
        return result.toString();
    }

}
