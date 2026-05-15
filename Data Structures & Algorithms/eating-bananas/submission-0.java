class Solution {

    public boolean possible(int[] piles, int k, int h) {

        int curr = 0;

        for(int p : piles) {
            curr+= Math.ceil((double)p/k);
        }

        if (curr > h) {return false; }
        else {return true;}
    }

    public int minEatingSpeed(int[] piles, int h) {
        int r = Integer.MIN_VALUE;
        int l = 1;
        for (int p : piles ) {
            r = Math.max(r, p);
        }

        while (l < r) {
            int m = (l + r) / 2;
            if (possible(piles, m, h)) {
                 r = m;
            }

            else if (!possible(piles, m, h)) {
                l = m+1;
            }
        }

        return l;
        
    }
}
