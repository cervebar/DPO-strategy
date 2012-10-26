package strategy;

import java.util.Stack;

/**
 *
 * @param <E> 
 * @author Babu
 */
public class VerboseStack<E> extends Stack<E>{

    /**
     * 
     * @param item
     * @return
     */
    @Override
    public E push(E item) {
        System.out.println("PUSH: "+item.toString());
        return super.push(item);
    }
    
    @Override
    public synchronized E pop() {
        E pop = super.pop();
        System.out.println("POP: " + pop.toString());
        return pop;
    }

}
