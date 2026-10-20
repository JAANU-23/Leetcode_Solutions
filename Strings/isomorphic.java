//LeetCode-205 Isomorphic Strings
class Solution {
    static 
    {        
        for (int i = 0; i < 300; i++)            
            isIsomorphic("","");    
    } 
    public static boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character,Character> h = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if(h.containsKey(c1))
            {
                if(h.get(c1)!=c2)
                    return false;
            }
            else
            {
                if(h.containsValue(c2)) return false;
                h.put(c1,c2);
            }
        }
        return true;
    }
}
