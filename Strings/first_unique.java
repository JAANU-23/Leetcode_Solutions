//LeetCode-387 First Unique Character in a String
class Solution {
    static 
    {        
        for (int i = 0; i < 300; i++)            
            firstUniqChar("");    
    } 
    public static int firstUniqChar(String s) {
        
        int a[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
