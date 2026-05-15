class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }

        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            while((i < s.length()) && !(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))) {
            	i++;
            }
            while((j >= 0) && !(Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j)))) {
            	j--;
            }

            if(i > j || i > s.length()) {
                return true;
            }
            
            
            if (s.charAt(i) != s.charAt(j)) {
            	return false;
            }
            i++;
            j--;
        }
        return true;       
    }
}
