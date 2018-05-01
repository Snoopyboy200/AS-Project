import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AKJA {

	public static void main(String[] args) {
		
	    date();
	    
		
	    Date d=new Date();
        d.setDate(d.getDate()+2);
		
		System.out.println(d);
		

	}

	
	
	
	public static void date() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		String date = sdf.format(new Date(1)); 
		System.out.println(date);
		
		
	}
	
	
	
	
}
