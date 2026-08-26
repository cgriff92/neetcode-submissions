class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] c = s.toCharArray();
        for(char ch : c)
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            if(ch == ')')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    Character check = stack.pop();
                    if(check != '(')
                    {
                        return false;
                    }
                }
            }
            if(ch == '}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    Character check = stack.pop();
                    if(check != '{')
                    {
                        return false;
                    }
                }
            }
            if(ch == ']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    Character check = stack.pop();
                    if(check != '[')
                    {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}
