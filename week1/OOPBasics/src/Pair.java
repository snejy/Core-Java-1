
public class Pair {
	private Object first;
	private Object second;
	
	public Pair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}
	
	public Object getFirst() {
		return first;
	}
	
	public Object getSecond() {
		return second;
	}

	public String toString(){
		return "(" + first.toString() + "," + second.toString() + ")";
	}
	
	public boolean equals(Pair pair){
		return pair.getFirst() == this.first && pair.getSecond() == this.second;
	}
}
