package strategy;

import java.util.Stack;
import tree.Node;

/**
 *
 * @param <K> 
 * @author Babu
 */
public class DFSStrategy<K extends Comparable,T> implements ITreeStrategy<K,T> {    
     protected Stack<Node<K,T>> stack;

    public DFSStrategy(Stack<Node<K,T>> stack) {
        this.stack=stack;
    }

    public DFSStrategy() {
        this.stack = new Stack<>();
    }
    
    

    @Override
    public Node<K,T> search(K key, Node<K,T> root) {
        stack.push(root);
        while (!stack.isEmpty()) {
            Node<K,T> n=stack.pop();
            if(key.equals(n.getKey())){
                return n;
            }
            if(!n.isLeaf()){
                stack.push(n.getRight());           
                stack.push(n.getLeft());
            }
        }
        return null;
    }

    @Override
    public void print(Node<K,T> root) {
        stack.push(root); 
        while (!stack.isEmpty()) {
            Node<K,T> n=stack.pop(); 
            n.printNode();
            if(!n.isLeaf()){
                stack.push(n.getRight());
                stack.push(n.getLeft());
            }           
        }      
    }
}
