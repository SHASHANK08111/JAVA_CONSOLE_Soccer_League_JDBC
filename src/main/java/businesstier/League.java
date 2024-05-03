package businesstier;

import java.util.Date;

public class League {

	private String leagueName;
	private Date startDate;
	private Date enddate;
	private int teamsCount;
	
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int getTeamsCount() {
		return teamsCount;
	}
	public void setTeamsCount(int teamsCount) {
		this.teamsCount = teamsCount;
	}
	@Override
	public String toString() {
		return "leagueName= " + leagueName + ", startDate= " + startDate + ", enddate=" + enddate
				+ ", teamsCount= " + teamsCount +"\n";
	}
	
	
}
