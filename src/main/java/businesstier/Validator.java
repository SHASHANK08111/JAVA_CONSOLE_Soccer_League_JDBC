package businesstier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validator {
	
	private final static Logger logger = LogManager.getLogger(Validator.class); 
	private static final ResourceBundle messages = ResourceBundle.getBundle("messages");
	
	public static boolean isValidLeagueName(String leagueName) {
		return leagueName.trim().length() > 0 && leagueName.matches("[a-zA-Z0-9\\s]+");
    }

    public static boolean isValidStartDate(Date startDate) {
    	Date currentDate = new Date();
        return startDate.after(currentDate);
    }

    public static boolean isValidEndDate(Date endDate, Date startDate) {
    	 return endDate.after(startDate);
    }

    public static boolean isValidTeamCount(int teamCount) {
    	return teamCount > 1;
    }
    

    public static void validate(League league) throws Exception {
        if (!isValidLeagueName(league.getLeagueName())) {
            logger.error(messages.getString("INVALID_LEAGUE_NAME"));
            throw new Exception(messages.getString("INVALID_LEAGUE_NAME"));
        }
        if (!isValidStartDate(league.getStartDate())) {
            logger.error(messages.getString("INVALID_START_DATE"));
            throw new Exception(messages.getString("INVALID_START_DATE"));
        }
        if (!isValidEndDate(league.getEnddate(), league.getStartDate())) {
            logger.error(messages.getString("INVALID_END_DATE"));
            throw new Exception(messages.getString("INVALID_END_DATE"));
        }
        if (!isValidTeamCount(league.getTeamsCount())) {
            logger.error(messages.getString("INVALID_TEAM_NUMBER"));
            throw new Exception(messages.getString("INVALID_TEAM_NUMBER"));
        }
    }
    
   
}
