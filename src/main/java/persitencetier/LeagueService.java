//package persitencetier;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import Utility.Converter;
//import businesstier.League;
//
//public class LeagueService {
//
//	public static List<League> leaguesListverified=new ArrayList<>();
////	
////	public static String addLeague(League league) {
////		leaguesListverified.add(league);
////		return "success";
////	}
////	
////	public static List<League> getLeagueDetails(){
////		return leaguesListverified;
////	}
//////	
//
//    private static final String FILE_PATH = "C:\\Users\\shashanksp\\Documents\\SoccerLeagueDatabase.txt";
//
//    synchronized public static String addLeague(League league) {
//        //leaguesListverified.add(league);
//        BufferedWriter writer = null;
//        try {
//            writer = new BufferedWriter(new FileWriter(FILE_PATH, true));
//            writer.write(league.getLeagueName());
//            writer.newLine(); // Write newline after league name
//            writer.write(Converter.DatetoString(league.getStartDate()));
//            writer.newLine(); // Write newline after start date
//            writer.write(Converter.DatetoString(league.getEnddate()));
//            writer.newLine(); // Write newline after end date
//            writer.write(Integer.toString(league.getTeamsCount()));
//            writer.newLine(); // Write newline after teams count
//            //System.out.println("League added and saved to file successfully.");
//            return "success";
//        } catch (IOException e) {
//           // System.err.println("Error adding league and saving to file: " + e.getMessage());
//            return "failure";
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    
//    synchronized public static List<League> getLeagueDetails() {
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(FILE_PATH));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String leagueName = line.trim(); // Read league name from the current line
//
//                // Read start date from the next line
//                line = reader.readLine();
//                Date startDate = Converter.ConvertStringToDate(line.trim());
//
//                // Read end date from the next line
//                line = reader.readLine();
//                Date endDate = Converter.ConvertStringToDate(line.trim());
//
//                // Read teams count from the next line
//                line = reader.readLine();
//                int teamsCount = Integer.parseInt(line.trim());
//
//                // Create League object and add to the list
//                League league = new League();
//                league.setLeagueName(leagueName);
//                league.setStartDate(startDate);
//                league.setEnddate(endDate);
//                league.setTeamsCount(teamsCount);
//                leaguesListverified.add(league);
//
//            }
//            //System.out.println("Leagues read from file successfully.");
//        } catch (IOException e) {
//            System.err.println("Error reading leagues from file: " + e.getMessage());
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return leaguesListverified;
//    }
//
//   
//
//}
//
