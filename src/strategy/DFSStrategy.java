package strategy;

import java.util.Stack;
import tree.Node;

/**
 *
 * @param <K> 
 * @author Babu
 */
public class DFSStrategy<K> implements ITreeStrategy<K> {    
     protected Stack<Node> stack;

    public DFSStrategy(Stack<Node> stack) {
        this.stack=stack;
    }

    public DFSStrategy() {
        this.stack = new Stack<>();
    }
    
    

    @Override
    public Node search(Object key, Node root) {
        stack.push(root);
        while (!stack.isEmpty()) {
            Node n=stack.pop();
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
    public void print(Node root) {
        stack.push(root); 
        while (!stack.isEmpty()) {
            Node n=stack.pop(); 
            n.printNode();
            if(!n.isLeaf()){
                stack.push(n.getRight());
                stack.push(n.getLeft());
            }           
        }      
    }
}
