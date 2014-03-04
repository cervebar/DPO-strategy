package tree;

/**
 *
 * @param <K> key
 * @param <T> value,that can be printed
 * @author Babu
 */
public class Node<K extends Comparable,T> {

    protected Node<K,T> left, right;
    protected T value;
    protected K key;
    protected int level;
    protected boolean leaf;

    public Node(K key,T value) {    
        this.left =  NullNode.getInstance();
        this.right = NullNode.getInstance();
        this.value=value;
        this.key=key;
        this.level=0;
        this.leaf=false;
    }
    protected Node(){
        
    }
    
    @Override
    public String toString(){
        return "NODE:level:"+level+" KEY:"+key+" VALUE: " + value.toString();
    }
    
    
    public void printNode(){
        System.out.println(this);
    }
    
    //GETTERS AND SETTERS-------------------------------------------------------

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }
    
    
    public Node<K,T> getLeft() {
        return left;
    }

    public void setLeft(Node<K,T> left) {
        this.left = left;
    }

    public Node<K,T> getRight() {
        return right;
    }

    public int getLevel() {
        return level;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRight(Node<K,T> right) {
        this.right = right;
    }
	public boolean isNullNode() {
		return false;
	}
     
}
