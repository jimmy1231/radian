package radian.util.collection;

/**
 * Collection Interface 
 * 
 * This is the base interface for the Radian Utils Library. A collection repres-
 * ents a group of objects, known as 'elements' (described by the generic type E). 
 * 
 * All classes which implement Collection should provide (at least) 2 construct-
 * ors: one which takes in no arguments and creates an empty Collection; and an-
 * other which converts the primitive types passed in to the Collections object 
 * with the same wrapped elements.
 * 
 * Element restrictions is completely up to the implementing class. For example,
 * some classes may choose to allow 'null' elements while others would reject 
 * them.
 * 
 * Classes which implement the Collection should focus primarily on performance 
 * of its operations. If a decision must be made over aesthetics (e.g. addition-
 * al functionality / pretty code) and the operational performance of the Colle-
 * ction, always choose the latter.
 * 
 * Runtime performance should be balanced with Spatial performance (memory usage). 
 * JVM performance is affected by excessive memory consumption - implementations 
 * should take into account of that, and other similar-typed performance 
 * tradeoffs.
 * 
 * @author Jimmy Li
 *
 * @param <E>
 */
public interface Collection<E> extends Iterable<E> {
	
	/**
	 * After this operation, the Collection should now contain this element. Re-
	 * turns false if the operation could not be completed. 
	 * 
	 * The implementation must clearly specify what types of elements can be ad-
	 * ded. It is up to the implementation to decide any restrictions to be pla-
	 * ced on the type of elements to be contained.
	 * 
	 * If a collection refuses to add a particular for any reason other than it 
	 * already contains the element, the Collection must throw an Exception rat-
	 * her than return false.
	 * 
	 * @param e - element to be added to the Collection
	 * @return
	 * @throws UnsupportedOperationException
	 * @throws ClassCastException
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public boolean add(E e) 
		throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException;
	
	/**
	 * Removes all entries in the Collection after this operation. The Collection 
	 * will still be allocated, it will just be empty after this operation. 
	 * 
	 * @throws UnsupportedOperationException
	 */
	public void clear()
		throws UnsupportedOperationException;
	
	/**
	 * Use the equals() method to compare whether the element 'o' is equal to an
	 * element 'e' currently in the Collection. 
	 * 
	 * Only removes a single instance of the element from the Collection, even 
	 * if there are more instances. Return true if 'o' is part of the Collection.
	 * 
	 * @param o - element to be removed from the Collection
	 * @return
	 * @throws ClassCastException
	 * @throws NullPointerException
	 * @throws UnsupportedOperationException
	 */
	public boolean remove(Object o)
		throws ClassCastException, NullPointerException, UnsupportedOperationException;
	
	/**
	 * Returns true if this collection contains the specified element. If the 
	 * provided object is 'null', then throw NullPointerException. Return false 
	 * if no elements were found that matched the given object.
	 * 
	 * @param o
	 * @return
	 * @throws ClassCastException - if type of 'o' is incompatible
	 * @throws NullPointerException - if 'o' equals null
	 */
	public boolean contains(Object o)
		throws ClassCastException, NullPointerException;
	
	/**
	 * Returns true if the Collection contains no elements
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the current size of the Collection. If the Collection has more 
	 * elements than Integer.MAX_VALUE, return Integer.MAX_VALUE. 
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * Returns an array containing all the elements in this collection. If this 
	 * Collection make guarantees about order of storage, then the converted ar-
	 * ray must be in the same order.
	 * 
	 * The returned array must be reference-safe: no references of the converted 
	 * array should belong in the Collection after the call is returned.
	 * 
	 * This method acts as a bridge between array-based and collection based APIs. 
	 * 
	 * @return
	 */
	public Object[] toArray(); 

}
