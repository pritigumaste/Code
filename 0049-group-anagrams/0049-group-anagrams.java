class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map1 = new HashMap<>();
            
            for(String s: strs)
            {
                char[] charArr = s.toCharArray();
                Arrays.sort(charArr);
                String sorted = String.valueOf(charArr);
                if(!map1.containsKey(sorted))
                {
                    map1.put(sorted, new ArrayList<>());
                }
                map1.get(sorted).add(s);
            }
        return new ArrayList<>(map1.values());
        }
}
