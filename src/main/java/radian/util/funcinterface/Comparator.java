package radian.util.funcinterface;

/**
 * Comparator Interface 
 * 
 * Imposes total ordering on a Collection. Often used to determine the sorting
 * order in Collection.sort() methods. If c.compare(e1, e2) == 0, then the ele-
 * ments are equal by definition of Comparator - and this rule will be used as 
 * basis for overarching operations (such as sort).
 * 
 * Be careful when implementing a comparator whose compare operation behaves di-
 * fferently from equals(), as this may pose logically contradicting behavior in
 * Collections whose native ordering semantics are defined on the basis of the 
 * equals() method rather than the implemented Comparator.
 * 
 * For example: a Set uses equals() to determine whether an element is unique 
 * and thus should/not be added to the Set. If the add() operation was, instead,
 * ordered by a Comparator where c1.equals(c2) == true && c1.compare(c2) != 0, 
 * then inserting both will be allowed despite the native semantics of Set 
 * prohibiting such insertion.
 * 
 * Comparable is recommended to be implemented with Serializableas they may be
 * used as ordering methods in serializable data structures like TreeMap/TreeSet
 * 
 * @author Jimmy Li
 * @param <E>
 */
@FunctionalInterface
public interface Comparator<T> {
	
	/**
	 * Compares 2 arguments for order. Returned integer is either Negative, Pos-
	 * itive, or Zero.
	 * 	(1) Negative: 1st argument is less than 2nd argument
	 * 	(2) Positive: 1st argument is greater than 2nd argument
	 * 	(3) Zero: Both arguments are equal
	 * 
	 * Properties: 
	 * 	(1) Commutative: (o1 > o2) => (o2 < o1)
	 * 	(2) Transitive: (o1 < o2) && (o2 < o3) => (o1 < o3)
	 * 	(3) Implicit : (o1 == o2) == o1.equals(o2) *Not Always - depends on imp-
	 * 		lementation
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 * @throws NullPointerException - If an argument is null and this comparator
	 * 		   does not permit null parameters.
	 * @throws ClassCastException - If the arguments' types prevent them from b-
	 * 		   eing compared by this comparator.
	 */
	public int compare(T o1, T o2)
			throws NullPointerException, ClassCastException;

}
