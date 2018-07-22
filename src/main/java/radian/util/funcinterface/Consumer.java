package radian.util.funcinterface;

/**
 * Consumer Interface 
 * 
 * A Consumer is a Functional Interface which is initialized as a lambda, and is
 * then executed by passing in the parameter to the accept function, either exp-
 * licitly, or implicitly through Java syntax.
 * 
 * @author Jimmy Li
 * @param <E>
 */
@FunctionalInterface
public interface Consumer<T> {
	
	/**
	 * Performs the consumer action on the parameter 't' of type T. When called,
	 * this method will execute the function which the Consumer was initialized
	 * to.
	 * 
	 * Since a Consumer, by definition, "consumes" the operation, it does not 
	 * have a return type.
	 * 
	 * @param t
	 */
	public void accept(T t); 
	
}
