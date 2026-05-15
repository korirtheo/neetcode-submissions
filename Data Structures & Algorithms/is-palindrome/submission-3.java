class Solution {

    public boolean isAlphaNum(char c) {
        if (
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9') ||
            (c >= 'A' && c <= 'Z')
        ) {return true;}

        return false;
    }

    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        int i = 0;
        int ln = s.length();
        int j = s.length() - 1;

        while (i <= j) {
            while((i < ln) && !(isAlphaNum(s.charAt(i)))) {
            	i++;
            }
            while((j >= 0) && !(isAlphaNum(s.charAt(j)))) {
            	j--;
            }
            if(i > j || i > s.length()) {
                return true;
            }
            char c1 = s.charAt(i);
            c1 = Character.toLowerCase(c1);

            char c2 = s.charAt(j);
            c2 = Character.toLowerCase(c2);

            
            if (c1 != c2) {
            	return false;
            }

            i++;
            j--;
        }
        return true;       
    }
}