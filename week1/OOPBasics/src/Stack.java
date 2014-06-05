
public interface Stack {
	boolean push( Object obj);
	Object pop();
	int length();
	boolean isEmpty();
	void clear();
	boolean isFull();
	void setMaxSize(int size);
	Object getTop();
	boolean isUnique(Object element);
}
