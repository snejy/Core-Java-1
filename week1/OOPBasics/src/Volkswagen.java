
public class Volkswagen extends Car{
	public Volkswagen(){
		super();
	}
	
	public String toString(){
		return super.toString();
	}

	public static void main ( String [] args){
		Volkswagen car1 = new Volkswagen();
		System.out.println(car1.toString());
	}
}