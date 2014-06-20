import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Utils {

	public static List<Integer> sort( List<Integer> sequence){
		List<Integer> sortedSequence = new ArrayList<Integer>(sequence);
		Collections.sort(sortedSequence);
		return sortedSequence;
	}

	public static List<Integer> reverse( List<Integer> sequence){
		List<Integer> reversedSequence = new ArrayList<Integer>(sequence);
		Collections.reverse(reversedSequence);
		return reversedSequence;

	}

	public static boolean isMonotonous( List<Integer> sequence){
		return sequence.equals(sort(sequence)) || sequence.equals(reverse(sort(sequence)));
	}
}
