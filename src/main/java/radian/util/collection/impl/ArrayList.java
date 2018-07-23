package radian.util.collection.impl;

import radian.util.collection.List;
import radian.util.collection.abstr.AbstractList;
import radian.util.funcinterface.Comparator;


public class ArrayList<E> extends AbstractList<E> implements List<E> 
{

	public boolean remove(Object o) 
			throws ClassCastException, NullPointerException, UnsupportedOperationException 
	{
		return false;
	}

	public int size() 
	{

		return 0;
	}

	public boolean add(int index, E element) 
			throws UnsupportedOperationException, ClassCastException, NullPointerException, 
				   IllegalArgumentException, IndexOutOfBoundsException 
	{

		return false;
	}


	public E get(int index) 
			throws IndexOutOfBoundsException 
	{

		return null;
	}


	public int indexOf(Object o) 
			throws ClassCastException, NullPointerException 
	{

		return 0;
	}


	public void sort(Comparator<? super E> c)
			throws ClassCastException, UnsupportedOperationException, IllegalArgumentException 
	{

	}
	
}
