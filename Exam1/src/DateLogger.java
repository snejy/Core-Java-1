
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateLogger extends Logger{
	private static final DateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YY| ");

	public DateLogger(int level) {
		super(level);
	}

	public DateLogger() {
		super();
	}

	public void log(int level, String message){
		Date time = new Date();
		super.log(level, dateFormat.format(time) + message);	
	}

	public void log(String message){
		this.log(super.DEFAULT_LEVEL, message);
	}

}
