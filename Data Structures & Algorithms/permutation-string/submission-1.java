class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ln1 = s1.length(), ln2 = s2.length();
        if(ln1 > ln2) return false;
        int[] letters = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < ln1 ; i++) {
            letters[s1.charAt(i)-'a'] +=1; 
            window[s2.charAt(i)-'a'] +=1;
        }
       
        if(Arrays.equals(window, letters)) return true;

        for (int i = ln1; i < ln2; i ++) {


            window[s2.charAt(i) - 'a'] += 1;
            window[s2.charAt(i - ln1) - 'a'] -= 1;

            if(Arrays.equals(window, letters)) return true;
        }

        return false;
        
    }
}
