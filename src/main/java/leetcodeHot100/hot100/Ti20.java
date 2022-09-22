package leetcodeHot100.hot100;

import java.util.Stack;

/**
 * @descriprion: https://leetcode.cn/problems/valid-parentheses/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                stack.push(s.charAt(i));
            else {
                if(!stack.isEmpty()){
                    if(s.charAt(i)==')' && stack.pop()!='(')
                        return false;
                    if(s.charAt(i)==']' && stack.pop()!='[')
                        return false;
                    if(s.charAt(i)=='}' && stack.pop()!='{')
                        return false;
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
