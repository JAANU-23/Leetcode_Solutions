//LeetCode-125 Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                t+=s.charAt(i);
        }
        t=t.toLowerCase();
        StringBuilder sb = new StringBuilder(t);
        sb=sb.reverse();
        String v = sb.toString();
        if(v.equalsIgnoreCase(t))
        return true;
        else return false;
    }
}
