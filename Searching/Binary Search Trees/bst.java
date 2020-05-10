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

    public Key min()
    {
    	if (isEmpty()) throw NoSuchElementException();
    	Node x = min(root);
    	return x.key;
    }

    private Key min(Node x)
    {
    	if (x.left == null) return x;
    	return min(x.left);
    }

    public Key max()
    {
    	if (isEmpty()) throw NoSuchElementException();
    	Node x = max(root)
    	return 
    }

    private Key max(Node x)
    {
    	if (x.right == null) return x;
    	return max(x.right)
    }

    public Key floor(Key key)
    {
    	return floor(root, key);
    }

    private Node floor(Node x, Key key)
    {
    	
    }

    public int rank(Key key)
    {
    	return rank(root, key);
    }

    private int rank(Node x, Key key)
    {
    	if (x.left == null) return 0;
    	int cmp = key.compareTo(x.key);
    	if (cmp<0) return rank(x.left, key);
    	else if (cmp>0) return 1 + size(x.left) + rank(x.right, key);
    	return size(x.left)
    }

    public void deleteMin()
    {
    	root = deleteMin(root);
    }

    private Node deleteMin(Node x)
    {
    	if (x.left == null) return x.right;
    	x.left = deleteMin(x.left);
    	x.n = size(x.left) + size(x.right) + 1;
    	return x;
    }

    public void delete(Key key)
    {
    	root = delete(root);
    }

    private Node delete(Node x, Key key)
    {
    	if (x == null) return null;
    	int cmp = key.compareTo(x.key);
    	if (cmp<0) x.left = delete(x.left, key);
    	else if (cmp>0) x.right = delete(x.right, key);
    	else
    	{
    		if (x.left == null) return x.right;
    		if (x.right == null) return x.left;
    		Node t = x;
    		x = min(t.right);
    		x.right = deleteMin(t.right);
    		x.left = t.left;
    	}
    	x.n = size(x.left) + size(x.right) + 1;
    	return x;

    }
}






















