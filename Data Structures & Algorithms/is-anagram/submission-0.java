class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> s1 = new HashMap<Character, Integer>();
    Map<Character, Integer> t1 = new HashMap<Character, Integer>();

    if (s.length() != t.length()) {
    return false;
    }

    int ln = t.length();
    for (int i = 0; i < ln; i++) {
         int countS = s1.getOrDefault(s.charAt(i), 0) + 1;
         int countT = t1.getOrDefault(t.charAt(i), 0) + 1;

        s1.put(s.charAt(i), countS);
        t1.put(t.charAt(i), countT);

    }

    if (s1.equals(t1)) {return true;}
    else {return false;}
    }
}
