class Solution {

    public boolean rec(char[][] board, String word, int c, int r, int index) {
        if(index == word.length()) return true;
        if(r >= board.length || r < 0) return false;
        if(c >= board[0].length || c < 0) return false;
        if (board[r][c] != word.charAt(index)) return false;

        char temp = board[r][c];
        board[r][c] = '#'; // Mark as visited
        


        boolean found = 
        rec(board, word, c + 1, r, index + 1) ||
        rec(board, word, c - 1, r, index + 1) ||
        rec(board, word, c, r + 1, index + 1) ||
        rec(board, word, c, r - 1, index + 1);

        board[r][c] = temp; // Restore original value



        return found;

    }

    public boolean exist(char[][] board, String word) {
        char[] wordc = word.toCharArray();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (rec(board, word, c,r,0)) return true;
            }
        }

        return false;
    }
}
