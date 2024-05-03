package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import businesstier.Validator;

public class Converter {
	private static final ResourceBundle messages = ResourceBundle.getBundle("messages");
	private final static Logger logger = LogManager.getLogger(Validator.class); 
	
	 public static Date ConvertStringToDate(String dateStr){
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				try {
					return dateFormat.parse(dateStr);
					
				} catch (ParseException e) {
					logger.error(messages.getString("INVALID_DATE"));
					e.printStackTrace();
					return null;
				}
	    }
	 
	 public static String DatetoString(Date date){
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Define your desired date format
		    return sdf.format(date);
	 }
}
