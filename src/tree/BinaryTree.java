package tree;

// ------------------ Addition of the node to the BST-------------------
import strategy.ITreeStrategy;

/**
 * Simple binary tree
 * @param <T> key
 * @param <K> object to be stored
 * @author Babu
 */
public class BinaryTree<K extends Comparable, T> {

    private Node<K, T> root;
    ITreeStrategy treeStrategy;
    protected int level = 0;

    public BinaryTree(ITreeStrategy searchStrategy) {
        this.root = NullNode.getInstance();
        this.treeStrategy = searchStrategy;
    }

    public void add(K key, T value) {
        Node node = new Node(key, value);
        root = addToTree(root, node);
    }

    protected Node addToTree(Node node, Node newNode) {
        level++;
        if (node instanceof NullNode) {
            node = newNode;
            node.setLevel(level);
            level = 0;
            return node;
        }
        if (newNode.getKey().compareTo(node.getKey()) > 0) {
            node.setLeft(addToTree(node.getLeft(), newNode));
            return node;
        }
        node.setRight(addToTree(node.getRight(), newNode));
        return node;
    }

    public Node find(K key) {
        return treeStrategy.search(key, root);
    }
    
    public void print(){
        treeStrategy.print(root);
    }

    //PRINT FOR TEST------------------------------------------------------------
    public void helpPrintRecursiveTree() {
        printNode(root);
    }

    protected void printNode(Node node) {
        System.out.println(node);
        if (!node.isLeaf()) {
            printNode(node.getLeft());        
            printNode(node.getRight());
        }
    }
}