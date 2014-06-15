
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateLogger extends Logger{
	public Date time;
	public DateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YY| ");

	public DateLogger(int level) {
		super(level);
	}

	public DateLogger() {
		super();
	}

	public void log(String message){
		if(super.getLevel() >= 3){
			time = new Date();
			System.out.println(dateFormat.format(time) + super.getLevel() + " => " + message);
		}
	}

	public void log(int level, String message){
		if(level <= 0){
			throw new LevelOutOfRangeException();
		}
		try{
			if(level > super.getLevel()){
				return;
			}
			else{
				time = new Date();
				System.out.println(dateFormat.format(time) + level + " => " + message);
			}
		}
		catch (LevelOutOfRangeException exception){
			exception.printStackTrace();
		}
	}

}
