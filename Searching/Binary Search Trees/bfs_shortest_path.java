public class BFS<Node root, Node target> {
    public BFS(Node root, Node target
    {
        Queue<Node> queue;
        int step = 0;
        queue.add(root);
        
        while (not queue.isEmpty()):
            {
                step += 1;
                int q_size = queue.size();
                for (int i=0; i<=q_size; i++)
                {
                    Node curr = queue.peek();
                    if (curr == target):
                        return step;
                    for (Node next : the neighbors of cur) {
                        add next to queue;
                    }
                }
                queue.pop();
            }
        return -1;
    }
}
