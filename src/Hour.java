import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Hour {
	
	SimpleDateFormat sfd = new SimpleDateFormat( "HH:mm:ss" );
	Calendar data = Calendar.getInstance();
 
	int hora = data.get(Calendar.HOUR_OF_DAY); 
	int min = data.get(Calendar.MINUTE);
	int seg = data.get(Calendar.SECOND);
	
}
