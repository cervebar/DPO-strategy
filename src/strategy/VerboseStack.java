package strategy;

import java.util.Stack;

/**
 *
 * @param <E> 
 * @author Babu
 */
public class VerboseStack<E> extends Stack<E>{
  
	
	private static final long serialVersionUID = 1901254160727328721L;

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
