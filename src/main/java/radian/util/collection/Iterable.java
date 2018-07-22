package radian.util.collection;

/**
 * Iterable Interface 
 * 
 * By implementing this method, types T can be iterated using the Java syntacti-
 * cal sugar: for-each loop - e.g. for (T t : array) { ... }, also known as the
 * enhanced for loop.
 * 
 * @author Jimmy Li
 * @param <T>
 */
public interface Iterable<T> {
	
	/**
	 * Performs the given Consumer action on each element of the array. For exa-
	 * mple, since a lambda is a FunctionalInterface, it can be passed in as an 
	 * action to be executed per each element. 
	 *  
	 * @param action
	 */
	public void forEach(Consumer<? super T> action)
		throws NullPointerException;
	
	/**
	 * Returns an iterator over elements of type T
	 * 
	 * @return - an Iterator
	 */
	public Iterator<T> iterator();
}
