package fpplesson4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class myDate {
	
	public static void main(String []args) {
		LocalDate date = LocalDate.now();
		String ndate= date.toString();
		
		System.out.print(getStartDate(ndate));
		//System.out.println("Today's date: " + LocalDate.parse(ndate, DateTimeFormatter.ofPattern("dd MM yyyy"))); // Current date 
		//System.out.println("Specified date: " + LocalDate.of(2000, 1, 1)); // Set a new Date
		
		
	}
	
	public static String getStartDate(String ndate)
	{
	    DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    return LocalDate.parse(ndate, inputFormat).format(outputFormat);
	}

	
}
