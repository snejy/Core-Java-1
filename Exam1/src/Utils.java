import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	
public class Utils {

	public List<Integer> sort( List<Integer> array){
		List<Integer> sortedArray = new ArrayList<Integer>(array);
		Collections.sort(sortedArray);
		return sortedArray;
	}
	
	public List<Integer> reverse( List<Integer> array){
		List<Integer> reversedArray = new ArrayList<Integer>(array);
		Collections.reverse(reversedArray);
		return reversedArray;
		
	}
	
	public boolean isMonotonous( List<Integer> array){
		return array.equals(sort(array)) || array.equals(reverse(sort(array)));
	}
}
