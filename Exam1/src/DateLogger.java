
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateLogger extends Logger{
	private Date time;
	private DateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YY| ");

	public DateLogger(int level) {
		super(level);
	}

	public DateLogger() {
		super();
	}

	public void log(int level, String message){
		if(level <= super.getLevel()){
			time = new Date();
			System.out.println(dateFormat.format(time));
			super.log(level, message);
		}
	}

	public void log(String message){
		this.log(super.getDefaultLevel(), message);
	}

}
