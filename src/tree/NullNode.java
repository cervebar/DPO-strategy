package tree;

/**
 *
 * @param <K> 
 * @param <T> 
 * @author Babu
 */
public class NullNode<K extends Comparable,T>  extends Node {
    private static NullNode instance;

    private NullNode() {        
        this.leaf=true;       
                
    }
    public static NullNode getInstance(){
        if(instance==null){
            instance=new NullNode();
        }
        return instance;
    }

    
 //OVERRIDEN NULL BEHAVIOUR-----------------------------------------------------
   @Override
    public String toString(){
        return "";
    }
    
    
    @Override
    public void printNode(){
    }
    
    
    @Override
    public void setLeaf(boolean leaf){
        //nohing null can be only leaf
    }
    @Override
    public boolean isLeaf() {
        return leaf;
    }    
    
    @Override
    public Node getLeft() {
        return this;
    }

    @Override
    public void setLeft(Node left) {        
    }

    @Override
    public Node getRight() {
        return this;
    }    

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public T getValue() {
        return null;
    }    

    @Override
    public void setRight(Node right) {       
    }
}
