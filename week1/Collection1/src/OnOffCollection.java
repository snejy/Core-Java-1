
import java.util.ArrayList;


public class OnOffCollection<E> extends ArrayList<E>{

	@Override
	public boolean add(E e)
	{
		if(this.contains(e) || e.equals(null)){
			return false;
		}
		else{
			super.add(e);
			return true;
		}
	}

}