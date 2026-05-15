class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxCount = 0;
        int l = 0;
        int ln = s.length();
        Map<Character, Integer> window = new HashMap<Character, Integer>();

        if (s.length() == 0) {return 0;}
        if (s.length() == 1) {return 1;}
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {return 1;}
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)){return 2;}

        for (int r = 0; r < ln ; r++) {            
            if (window.containsKey(s.charAt(r))) {                   
                System.out.println(r + " r");      
                System.out.println(l + " l");
                l = Math.max(window.get(s.charAt(r)) + 1, l);    
                //l = window.get(s.charAt(r)) + 1;
            }
            maxCount = Math.max(maxCount, r-l + 1);
            window.put(s.charAt(r), r);
        }

        return maxCount;
        
    }
}
