package businesstier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import persitencetier.LeagueServiceJDBC;

public class LeagueManager {
	private final static Logger logger = LogManager.getLogger(Validator.class); 
	private static final ResourceBundle messages = ResourceBundle.getBundle("messages");
 
	public String addLeagues(List<League> leaguesList) {
		 StringBuilder result = new StringBuilder();
	        for (League league : leaguesList) {
	            try {
	                Validator.validate(league);
	                result.append("League added status: ").append(LeagueServiceJDBC.addLeague(league)).append(": ").append(league.getLeagueName()).append("\n");
	            } catch (Exception e) {
	                result.append(e.getMessage()).append("\n");
	            }
	        }
	        return result.toString();
	}
	
	
	 public List<League> getLeaguesDetailsOnOrAfter(Date date) throws Exception {
		    List<League> allLeagues=LeagueServiceJDBC.getLeagueDetails();
	        List<League> leaguesOnOrAfterDate = new ArrayList<>();
	        if(!allLeagues.isEmpty()) {
	        	leaguesOnOrAfterDate=allLeagues.stream().filter(league->league.getStartDate().after(date) || league.getStartDate().equals(date)).toList();
	        }
	        if(leaguesOnOrAfterDate.isEmpty()) {
	        	logger.error(messages.getString("NO_RECORD_FOUND"));
	        	throw new Exception(messages.getString("NO_RECORD_FOUND"));
	        	
	        }
	        return leaguesOnOrAfterDate;
	 }
}
