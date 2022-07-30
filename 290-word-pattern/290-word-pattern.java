class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words= s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rmap = new HashMap<>();
        
        if(pattern.length() != words.length)return false; 
        
        for(int i=0;i<pattern.length(); i++)
        {
            String str= words[i];
            char key = pattern.charAt(i);
           
             if(map.containsKey(key) && !map.get(key).equals(str)){
                 return false;
            } 
            map.put(key, str); 
            
            if(rmap.containsKey(str)&&rmap.get(str)!=key) return false;
            rmap.put(str, key);
       }
       return true; 
  
            
    }
}        
              
        