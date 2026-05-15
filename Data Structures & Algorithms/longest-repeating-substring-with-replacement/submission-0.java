class Solution {
    public int characterReplacement(String s, int k) {

        int ans = 0;

        int l = 0;
        Map<Character, Integer> count = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0)  + 1);

            int common = 0;
            int size = 0;
            for(char c : count.keySet()) {
                common = Math.max(count.get(c), common);
                size += count.get(c);
            }

            while (size - common > k) {
                char curr = s.charAt(l);
                int temp = count.get(curr) - 1;
                count.put(curr, temp);
                l++;
                size--;
            }

            ans = Math.max(ans, r-l + 1);
      
        }

        return ans;
        
        
    }
}
