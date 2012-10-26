package strategy;

import java.util.LinkedList;

/**
 *
 * @param <E> 
 * @author Babu
 */
public class VerboseFifo<E> extends LinkedList<E> {
    
    @Override
    public E removeFirst() {
        E removeFirst = super.removeFirst();
        System.out.println("REMOVE FIRST: "+removeFirst.toString());
        return removeFirst;
    }
    
    @Override
    public boolean add(E e) {        
        System.out.println("ADD: "+e.toString());
        return super.add(e);
    }


}
