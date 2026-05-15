class Node {
    public char val;
    public Node[] children ;
    boolean isWord;

    public Node() { 
        children = new Node[26];
        isWord = false;
    }
    public Node(char val) {
        this.val = val;
        this.children = new Node[26];
        this.isWord = false;
    }
}

class PrefixTree {
    private Node ent;

    public PrefixTree() {
         this.ent = new Node(); 
    }

    public void insert(String word) {
        Node curr = ent;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) {

                curr.children[c-'a'] = new Node(c);
            }

            curr = curr.children[c-'a'];

        }

        curr.isWord = true;

    }

    public boolean search(String word) {
        Node curr = ent;

        for (int i = 0; i < word.length(); i ++) {
            char c = word.charAt(i);
            // if (curr.children[c - 'a'] != null) {
            //     curr = curr.children[c - 'a'];
            // }
            // else {
            //     return false;
            // }

            if (curr.children[c - 'a'] == null) {
                return false;
            }
            curr = curr.children[c - 'a'];
        }

        return curr.isWord;

    }

    public boolean startsWith(String prefix) {
        Node curr = ent;

        for (int i = 0; i < prefix.length(); i ++) {
            char c = prefix.charAt(i);
            if (curr.children[c - 'a'] != null) {
                curr = curr.children[c - 'a'];
            }
            else {
                return false;
            }
        }
        
        return true;
    }
}
