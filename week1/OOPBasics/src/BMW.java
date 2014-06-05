
public class BMW extends Car{
	public BMW(){
		super();
	}
	
	public String toString(){
		return super.toString();
	}

	public static void main ( String [] args){
		BMW car1 = new BMW();
		System.out.println(car1.toString());
	}
}