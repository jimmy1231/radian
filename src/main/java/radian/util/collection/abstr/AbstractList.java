package radian.util.collection.abstr;

import radian.util.collection.Iterator;
import radian.util.collection.List;
import radian.util.exception.NoSuchElementException;
import radian.util.funcinterface.Consumer;

public abstract class AbstractList<E> implements List<E> 
{
	
	public boolean add(E e) 
			throws ClassCastException, NullPointerException, IllegalArgumentException
	{		
		return AbstractList.this.add(AbstractList.this.size(), e);
	}
	
	
	public E replace(int index, E element) 
			throws ClassCastException, NullPointerException, IllegalArgumentException, 
				   IndexOutOfBoundsException
	{	
		E original = null; 
		
		if (element == null) 
			throw new NullPointerException(); 
		
		original = AbstractList.this.get(index);

		if (!AbstractList.this.add(index, element)) 
			throw new IllegalArgumentException();
		
		return original;
	}
	
	
	public boolean contains(Object o) 
			throws ClassCastException, NullPointerException
	{
		if (o == null) 
			throw new NullPointerException();
		
		return (AbstractList.this.indexOf(o) == -1);
	}
	
	
	public List<E> subList(int fromIndex, int toIndex) 
			throws IndexOutOfBoundsException, UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
	
	
	public void clear() throws UnsupportedOperationException
	{
		int i; 
		
		for (i = 0; i < AbstractList.this.size(); i++ ) {
			AbstractList.this.remove(AbstractList.this.get(i));
		}
	}
	
	
	public boolean isEmpty() 
	{
		return (AbstractList.this.size() == 0);
	}
	
	
	public Object[] toArray() 
	{
		int i; 
		Object[] arr = new Object[AbstractList.this.size()];
		
		for (i = 0; i < AbstractList.this.size(); i++ ) {
			arr[i] = AbstractList.this.get(i);
		}
		
		return arr;
	}
	
	
	public Iterator<E> iterator() 
	{
		return new Iterator<E>() 
		{
			private int curr = 0;
			
			public boolean hasNext() 
			{
				return (curr + 1 == AbstractList.this.size());
			}

			public E next() throws NoSuchElementException 
			{	
				if (!this.hasNext()) 
					throw new NoSuchElementException(); 
				
				curr += 1; 
				
				return AbstractList.this.get(curr);
			}
		};
	}
	
	
	public void forEach(Consumer<? super E> action) {
		int i; 
		
		for (i = 0; i < AbstractList.this.size(); i++ ) {
			action.accept(AbstractList.this.get(i));
		}
	}
	
}
