
public class StackImpl implements Stack {
	private int size = 0;
	private int maxSize = 10;
	private int top = -1;
	private Object [] buffer;
	
	public StackImpl(int max){
		maxSize = max;
		buffer = new Object [maxSize];
			
	}
	public StackImpl(){
		buffer = new Object [maxSize];
			
	}
	
	@Override
	public boolean push(Object obj) {
		if( this.size < this.maxSize){
			this.buffer[this.size] = obj;
			this.size += 1;
			return true;
		}
		return false;
	}

	@Override
	public Object pop() {
		Object element = this.buffer[size];
		this.buffer[this.size] = null;
		this.size -= 1;
		return element;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = null;	
		}
	}

	@Override
	public boolean isFull() {
		return size == maxSize;
	}

	@Override
	public void setMaxSize(int size) {
		this.maxSize = size;
	}

	@Override
	public Object getTop() {
		top = size -1;
		return buffer[top];
	}
	@Override
	public boolean isUnique(Object element) {
		for (int i = 0; i < buffer.length; i++) {
			if(buffer[i] == element){
				return false;
			}
		}
		buffer[size] = element;
		size ++;
		return true;
	}

}
