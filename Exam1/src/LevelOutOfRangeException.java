
public class LevelOutOfRangeException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 216940585744858276L;

	public LevelOutOfRangeException(){
		super("Level must be in range 1-5.");
	}

}
