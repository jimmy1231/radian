package radian.util.collection;

/**
 * List Interface 
 * 
 * @author dfjim
 *
 * @param <E>
 */
public interface List<E> extends Collection<E> {
	
	/**
	 * Returns an element at the specified position in the list. The element is 
	 * returned as a reference.
	 * 
	 * If the index of the element is out of range, then IndexOutOfBoundsExcep-
	 * tion is thrown.
	 * 
	 * @param index
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	E get(int index)
		throws IndexOutOfBoundsException; 
	
	/**
	 * Returns the index of the first occurrence of the specified element in the
	 * list, or -1 if this list does not contain the element.
	 * 
	 * @param o
	 * @return <code>-1</code> If element does not exist in the List
	 * @throws ClassCastException - If the type of the object is incompatible
	 * @throws NullPointerException - If the specified element is null
	 */
	int indexOf(Object o)
		throws ClassCastException, NullPointerException;
	
	/**
	 * Replaces the element at the specified location (by 'index') with the giv-
	 * en element. Returns the element that was replaced (at 'index'). This is 
	 * an optional implementation. If the implementation of List does not suppo-
	 * rt replace, then throw UnsupportedOperationException.
	 * 
	 * @param index
	 * @param element
	 * @return <code>E</code> the element that was replaced
	 * @throws UnsupportedOperationException
	 * @throws ClassCastException - If element is incompatible with List type
	 * @throws NullPointerException - If element passed as argument is null
	 * @throws IllegalArgumentException - If property in element prevents adding
	 * @throws IndexOutOfBoundsException - If index provided is out of range
	 */
	E replace(int index, E element)
		throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException;
	
	/**
	 * Sorts the list according to the order induced by the specified Comparator
	 * All elements in this list must be mutually comparable: i.e. c.compare(e1,
	 * e2) must not throw a ClassCastException for any elements in the List.
	 * 
	 * <b>Algorithms for Implementation:</b>
	 * Several algorithms should be tested for effectiveness - while quicksort
	 * is the best algorithm given a good pivot, mergesort is a stable sort whi-
	 * ch has consistent performance that is independent of runtime.
	 * 
	 * A stable choice is therefore the mergesort, which has a worst and average
	 * performance of O(nlog(n)). 
	 * 
	 * To improve performance, in-place sorting is avoided, a copy of the List's 
	 * elements is first stored in an array. The array is then sorted using the 
	 * algorithms described above and the List is then updated with the sorted 
	 * elements in the array.
	 * 
	 * @param c
	 * @throws ClassCastException - If incompatible List and Comparator elements
	 * @throws UnsupportedOperationException - If List does not support operation
	 * @throws IllegalArgumentException - If Comparator found to violate contract
	 */
	void sort(Comparator<? super E> c)
		throws ClassCastException, UnsupportedOperationException, IllegalArgumentException;
	
	/**
	 * Returns a view of the portion of this list between the specified <code>
	 * fromIndex</code>, and <code>toIndex</code>. If the 2 parameters are equa-
	 * l, the returned list is empty.
	 * 
	 * A view is like a subset of a list - not a copy. So in changing the view,
	 * the original list is changed. For example: list.subList(0, 5).clear() wo-
	 * uld remove elements 0 to 5 from the original list.
	 * 
	 * Note that operating on the original list while keeping a sublist could c-
	 * hange semantics of sublist operations - as the views are reference based.
	 * 
	 * @param fromIndex - Start index (inclusive)
	 * @param toIndex - End index (exclusive)
	 * @return
	 * @throws IndexOutOfBoundsException - If any indices are out of bounds.
	 */
	List<E> subList(int fromIndex, int toIndex)
		throws IndexOutOfBoundsException;
	
}
