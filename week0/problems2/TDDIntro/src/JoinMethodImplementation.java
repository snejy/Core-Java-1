
public class JoinMethodImplementation {
	public String stichMeUp(String glue, Object... array){
		String new_string = array[0].toString();
		for (int i = 1; i < array.length; i++) {
			new_string = new_string + glue + array[i].toString();
		}
		return new_string;
	}
}
