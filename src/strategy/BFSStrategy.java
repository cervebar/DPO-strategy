package strategy;

import java.util.LinkedList;
import tree.Node;

/**
 *
 * @param <K>  
 * @author Babu
 */
public class BFSStrategy<K> implements ITreeStrategy<K> {

    private LinkedList<Node> fifo;

    public BFSStrategy(LinkedList<Node> fifo) {
        this.fifo = fifo;
    }

    public BFSStrategy() {
        this.fifo = new LinkedList<>();
    }
    

    @Override
    public Node search(Object key, Node root) {
        fifo.add(root);
        while (!fifo.isEmpty()) {
            Node n = fifo.removeFirst();
            if (key.equals(n.getKey())) {
                return n;
            }
            if (n.getRight() != null) {
                fifo.add(n.getRight());
            }
            if (n.getLeft() != null) {
                fifo.add(n.getLeft());
            }
        }
        return null;
    }

    @Override
    public void print(Node root) {
        fifo.add(root);
        while (!fifo.isEmpty()) {
            Node n = fifo.removeFirst();
            n.printNode();
            if(!n.isLeaf()){            
            fifo.add(n.getLeft());
            fifo.add(n.getRight());
            }
        }
    }
}
