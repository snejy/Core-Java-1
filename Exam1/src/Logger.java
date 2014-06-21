
public class Logger {
	private int level;
	protected static final int DEFAULT_LEVEL = 3;


	public Logger(int level){
		this.level = level;
	}

	public Logger() {
		this(DEFAULT_LEVEL);
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}


	public void log( int level, String message) {
		if(level <= 0){
			throw new LevelOutOfRangeException();
		}
		else{
			if(level <= this.getLevel()){
				System.out.println(level + " => " + message);
			}
		}
	}


	public void log(String message){
		this.log(DEFAULT_LEVEL, message);
	}

} 
