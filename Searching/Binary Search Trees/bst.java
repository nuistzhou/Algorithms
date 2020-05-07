public class BST<Key extends Comparable<Key>, Value>
{
    private Node root;

    public class Node
    {
        private Key key;
        private Value val;
        private int n;
        private Node left, right;

        public Node(Key key, Value val, int n)
        {
            this.key = key;
            this.val = val;
            this.n = n;
        }
    }

    public int size()
    {
        return size(root);
    }

    private int size(Node node)
    {
        if (node == null) return 0;
        else return node.n;
    }

    public Value get(Key key)
    {
        return get(this.root, key)
    }

    private Value get(Node node, Key key)
    {
        if (node == null) return null;
        int cmp = key.compareTo(node.val);
        if (cmp > 0) return get(node.right, key);
        else if (cmp < 0) return get(node.left, key);
        else return node.val;
    }

    public put(Key key, Val val)
    {
        put(this.root, key, val)
    }
    private put(Node node, Key key, Val val)
    {
        if (node == null) return new Node(key, val, 1);
        int cmp = key.compareTo(node.val);
        if (cmp < 0) node.left = put(node.left, key, val);
        else if (cmp > 0) node.right = put(node.right, key, val);
        else node.val = val;
        node.n = size(node.left) + size(node.right) + 1;
        return node;
    }

}






