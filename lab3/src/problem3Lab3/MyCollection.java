package problem3Lab3;

public interface MyCollection {
	boolean insert(Object x);
	boolean add(Object x);
	boolean remove(Object x);
	boolean contains(Object x);
	boolean addAll(Object x);
	boolean containsAll(Object x);
	boolean removeAll(Object x);
	int size();
	int capasity();
	void clear();
}
