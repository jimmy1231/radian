package radian.util.collection;

public interface List<E> extends Collection<E> {
	
	E get(int index); 
	
	int indexOf(Object o);
	
	E replace(int index, E element);
	
	void sort(Comparator<? super E> c);
	
	List<E> subList(int fromIndex, int toIndex);
	
}
