package strategy;
import tree.Node;

/**
 *
 * @param <K> key to search
 * @author Babu
 */
public interface ITreeStrategy<K extends Comparable,T> {

    /**
     * Search for node asociated with the key
     * @param key
     * @param root the first node to start
     * @return 
     */
    Node<K,T> search(K key, Node<K,T> root);
    
    void print(Node<K,T> root);
}
