import java.util.Stack;
 class Day2_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch=='[' || ch=='{'|| ch=='(')
            {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                char top= stack.pop();
                if(ch==')'&& top!='(') {return false;}
                if(ch=='}'&& top!='{') {return false;}
                if(ch==']'&& top!='[') {return false;}
            }
        }
        return stack.isEmpty();
    }
        public static void main(String[] args) {
        Day2_ValidParentheses solution = new Day2_ValidParentheses();
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]"));     // false
        System.out.println(solution.isValid("([)]"));   // false
        System.out.println(solution.isValid("{[]}"));   // true
        System.out.println(solution.isValid("("));      // false
    }                          

}