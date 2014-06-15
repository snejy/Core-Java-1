

public class Logger {
	private int level;
	
	public Logger() {
		this.level = 3;
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
	
	public void log( int level, String message) throws LevelOutOfRangeException{
		if(level <= 0){
			throw new LevelOutOfRangeException();
		}
		try{
			if(level > this.getLevel()){
				return;
			}
			else{
				System.out.println(level + " => " + message);
			}
		}
		catch (LevelOutOfRangeException exception){
			exception.printStackTrace();
		}
	}


	public void log(String message){
		if(this.getLevel() >= 3){
		System.out.println(this.getLevel() + " => " + message);
		}
	}
	
} 
 