class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder replace = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                replace.append(Character.toLowerCase(c));
            }
        }
        int len = replace.length();
        String a;
        String b;
        for(int i = 0; i < len; i++)
        {
            a = replace.substring(i,i+1);
            b = replace.substring(len-i-1, len-i);
            if(!a.equals(b))
            {
                return false;
            }
        }
        return true;

    }
}
