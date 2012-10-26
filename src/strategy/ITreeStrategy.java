package strategy;
import tree.Node;

/**
 *
 * @param <K> key to search
 * @author Babu
 */
public interface ITreeStrategy<K> {

    /**
     * Search for node asociated with the key
     * @param key
     * @param root the first node to start
     * @return 
     */
    Node search(K key, Node root);
    
    void print(Node root);
}
