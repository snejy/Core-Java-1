
public class Audi extends Car{
	public Audi(){
		super();
	}
	
	public String toString(){
		return super.toString();
	}

	public static void main ( String [] args){
		Audi car1 = new Audi();
		System.out.println(car1.toString());
	}
}
