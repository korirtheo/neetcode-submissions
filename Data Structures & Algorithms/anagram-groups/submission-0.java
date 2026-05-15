class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> res = new HashMap<String, List<String>>();

        for(String s: strs) {

            int[] arr = new int['z' -'a' + 1];
            for (int i = 0; i < s.length(); i ++) {
                arr[s.charAt(i) - 'a'] ++;
            }           
            String k = Arrays.toString(arr);
            res.putIfAbsent(k, new ArrayList<>());
            res.get(k).add(s);
            
        }

    return new ArrayList<>(res.values());
        
    }
}
