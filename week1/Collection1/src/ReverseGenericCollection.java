import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ReverseGenericCollection {
	
	public static <T> void reverse(Collection<T> collection){
		Collections.sort((List<T>) collection, Collections.reverseOrder() );
	}

}
