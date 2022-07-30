class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())return false; 
       // if(s.length() == t.length())
        {
            HashMap<Character, Character> sMap = new HashMap<>();
            HashMap<Character, Character> tMap = new HashMap<>();
            
            for(int i=0; i<s.length(); i++)
            {
                Character sChar = s.charAt(i);
                Character tChar = t.charAt(i); 
                if(sMap.containsKey(sChar)){
                    if(sMap.get(sChar) != tChar) return false; 
                 }
                else {
                    sMap.put(sChar, tChar);
                }
                
                if(tMap.containsKey(tChar)){
                    if(tMap.get(tChar) != sChar) return false;
                }
                else {
                    tMap.put(tChar, sChar);
                }
            }
            
            
        }
        return true;
    }
}