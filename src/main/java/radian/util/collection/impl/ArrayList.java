package radian.util.collection.impl;

import radian.util.collection.Iterator;
import radian.util.collection.List;
import radian.util.collection.abstr.AbstractList;
import radian.util.funcinterface.Comparator;
import radian.util.funcinterface.Consumer;

public class ArrayList<E> extends AbstractList<E> implements List<E> 
{

	
	public boolean add(E e)
			throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException 
	{
		return false;
	}

	public void clear() throws UnsupportedOperationException 
	{
		
	}

	public boolean remove(Object o) throws ClassCastException, NullPointerException, UnsupportedOperationException 
	{
		return false;
	}

	public boolean contains(Object o) throws ClassCastException, NullPointerException 
	{
		return false;
	}

	public boolean isEmpty() {
		return false;
	}

	public int size() 
	{
		return 0;
	}

	public Object[] toArray() 
	{
		return null;
	}

	public void forEach(Consumer<? super E> action) throws NullPointerException 
	{
		
	}

	public Iterator<E> iterator() 
	{
		return null;
	}

	public boolean add(int index, E element) throws UnsupportedOperationException, ClassCastException,
			NullPointerException, IllegalArgumentException, IndexOutOfBoundsException 
	{
		return false;
	}

	public E get(int index) throws IndexOutOfBoundsException 
	{
		return null;
	}

	public int indexOf(Object o) throws ClassCastException, NullPointerException 
	{
		return 0;
	}

	public E replace(int index, E element) throws UnsupportedOperationException, ClassCastException,
			NullPointerException, IllegalArgumentException, IndexOutOfBoundsException 
	{
		return null;
	}

	public void sort(Comparator<? super E> c)
			throws ClassCastException, UnsupportedOperationException, IllegalArgumentException {
		
	}

	public List<E> subList(int fromIndex, int toIndex) throws IndexOutOfBoundsException 
	{
		return null;
	}

}
