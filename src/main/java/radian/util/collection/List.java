package radian.util.collection;

import radian.util.funcinterface.Comparator;

/**
 * List Interface 
 * 
 * The List interface provides method definitions for List implementations. List 
 * is an ordered Collection (or a Sequence) in which its interface has precise 
 * control over where the element is inserted, and each element can be accessed
 * through an integer index. 
 * 
 * List allow duplicate elements (unlike Set), however, implementations can res-
 * trict duplicates if they wished by throwing Runtime Exceptions upon duplicate
 * insertion. 
 * 
 * List implementations should provide methods for adding, removing, replacing, 
 * searching, and sorting operations, with fundamental data structures and 
 * algorithms of the implementation's choosing. 
 * 
 * @author Jimmy Li
 *
 * @param <E>
 */
public interface List<E> extends Collection<E> {
	
	
	/**
	 * Inserts 'element' at a specified index location in the List, then shifts
	 * all indices of following elements down by 1. 
	 * 
	 * Depending on the implementation, shifting could be a synonym of other op-
	 * erations that are needed to maintain order in the list: i.e. restructuri-
	 * ng heap in a HeapList.
	 * 
	 * @param index
	 * @param element
	 * @return <code>true | false</code> - Depending on whether op was completed
	 * @throws UnsupportedOperationException - If add operation not supported
	 * @throws ClassCastException - If class specified by element prevents add
	 * @throws NullPointerException - If specified element is <code>null</code>
	 * @throws IllegalArgumentException - If some property in element prohibits add
	 * @throws IndexOutOfBoundsException - If specified index is out of range
	 */
	public boolean add(int index, E element)
		throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException;
	
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
	public E get(int index)
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
	public int indexOf(Object o)
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
	public E replace(int index, E element)
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
	public void sort(Comparator<? super E> c)
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
	public List<E> subList(int fromIndex, int toIndex)
			throws UnsupportedOperationException, IndexOutOfBoundsException;
	
}
