package persitencetier;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import businesstier.DataSource;
import businesstier.League;

public class LeagueServiceJDBC {

	
	public static String addLeague(League league) {
	    Connection con=null;
		PreparedStatement ps=null;
			try {
			    con=DataSource.getConnection();
				ps=con.prepareStatement("insert into league value(?,?,?,?)");
				ps.setString(1,league.getLeagueName());
				ps.setDate(2,new java.sql.Date(league.getStartDate().getTime()));
				ps.setDate(3,new java.sql.Date(league.getEnddate().getTime()));
				ps.setInt(4, league.getTeamsCount());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				return "Failed";
			}finally {
					try {
						if(ps!=null) {
						     ps.close();
						}
						if(con!=null) {
							con.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			}
		return "Success";
	}
	
	public static List<League> getLeagueDetails() {
	    List<League> leaguesListverified=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DataSource.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from league");
			if(rs.next()) {
				leaguesListverified=new ArrayList<>();
			}
			do {
				League league=new League();
				league.setLeagueName(rs.getString(1));
				league.setStartDate(new java.util.Date(rs.getDate(2).getTime()));
				league.setEnddate(new java.util.Date(rs.getDate(3).getTime()));
				league.setTeamsCount(rs.getInt(4));
				leaguesListverified.add(league);
			}while(rs.next());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st!=null) {
				     st.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	    }
		return leaguesListverified;
		
	}
}
