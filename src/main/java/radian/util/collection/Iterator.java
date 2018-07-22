package radian.util.collection;

import radian.util.exception.NoSuchElementException;


/**
 * Iterator Interface 
 * 
 * An iterator over a Collection. Successive calls to Iterator (e.g. next() ) 
 * will return successive elements in the Collection. During implementation, the
 * Iterator could be created as a nested class to the wrapped Collections class, 
 * for convenience of not having to store a reference to instance of the Collec-
 * tion class the Iterator is trying to iterate.
 * 
 * An alternate Interface to Iterator is Enumeration - both have the same func-
 * tional intentions.
 * 
 * @author Jimmy Li
 * @param <E>
 */
public interface Iterator<E> {
	
	/**
	 * Returns true if the iteration has more elements. For example, hasNext() 
	 * would only return false if the current element was the last element in t-
	 * he iteration.
	 * 
	 * @return <code>true</code> If the iteration has more elements
	 */
	public boolean hasNext(); 
	
	/**
	 * Returns the next element in the iteration. If there are no more elements
	 * in the list, then throw NoSuchElementException.
	 * 
	 * @return
	 * @throws NoSuchElementException 
	 */
	public E next()
		throws NoSuchElementException; 

}
