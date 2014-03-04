package strategy;

import java.util.LinkedList;
import tree.Node;

/**
 *
 * @param <K>  
 * @author Babu
 */
public class BFSStrategy<K extends Comparable,T> implements ITreeStrategy<K,T> {

    private LinkedList<Node<K,T>> fifo;

    public BFSStrategy(LinkedList<Node<K,T>> fifo) {
        this.fifo = fifo;
    }

    public BFSStrategy() {
        this.fifo = new LinkedList<>();
    }
    

    @Override
    public Node<K,T> search(K key, Node<K,T> root) {
        fifo.add(root);
        while (!fifo.isEmpty()) {
            Node<K,T> n = fifo.removeFirst();
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
    public void print(Node<K,T> root) {
        fifo.add(root);
        while (!fifo.isEmpty()) {
            Node<K,T> n = fifo.removeFirst();
            n.printNode();
            if(!n.isLeaf()){            
            fifo.add(n.getLeft());
            fifo.add(n.getRight());
            }
        }
    }
}
