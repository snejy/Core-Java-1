
public class Logger {
	private int level;
	private final int defaultLevel = 3;

	public Logger() {
		this.level = defaultLevel;
	}
	public Logger(int level){
		this.level = level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public int getDefaultLevel() {
		return defaultLevel;
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
		this.log(defaultLevel, message);
	}

} 
