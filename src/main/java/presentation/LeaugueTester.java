//package presentation;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//import Utility.Converter;
//import businesstier.*;
//import persitencetier.LeagueService;
//
//public class LeaugueTester {
//	 
//	 
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        LeagueManager leagueManager = new LeagueManager();
//	        LeagueManager leagueManager1= new LeagueManager();
//
//	        int ch=1;
//	        while(ch==1) {
//	        	System.out.println("Enter the option");
//	        	System.out.println("1.Add League");
//	        	System.out.println("2.League Report");
//	        	System.out.println("3.Exit");
//	        	int ch1=scanner.nextInt();
//	        	scanner.nextLine(); 
//	        	switch(ch1) {
//		        	case 1:
//		        	    System.out.println("Enter number of leagues:");
//		        	    int numberOfLeagues = scanner.nextInt();
//		        	    scanner.nextLine();
//		        	    List<League> leaguesList = new ArrayList<>();
//		        	    for (int i = 0; i < numberOfLeagues; i++) {
//			        		League league = new League();
//			 	            System.out.println("Enter league name:");
//			 	            league.setLeagueName(scanner.nextLine());
//			 	            System.out.println("Enter start date (yyyy-MM-dd):");
//			 	            league.setStartDate(Converter.ConvertStringToDate(scanner.nextLine()));
//			 	            System.out.println("Enter end date (yyyy-MM-dd):");
//			 	            league.setEnddate(Converter.ConvertStringToDate(scanner.nextLine()));
//			 	            System.out.println("Enter number of teams:");
//			 	            league.setTeamsCount(scanner.nextInt());
//			 	            scanner.nextLine();
//			 	            leaguesList.add(league);
//		        	    }
//		        	    String addLeagueResultinString = leagueManager.addLeagues(leaguesList);
//		        	    System.out.println(addLeagueResultinString);
//		        		break;	
//		        	case 2:
//		        		System.out.println("Enter date for league report which are starting on or after given date  (yyyy-MM-dd):");
//		     	        Date reportDate = Converter.ConvertStringToDate(scanner.nextLine());
//					    List<League> leaguesReport=new ArrayList<>();
//					try {
//						leaguesReport = leagueManager.getLeaguesDetailsOnOrAfter(reportDate);
//					} catch (Exception e) {
//						System.out.println(e.getMessage());
//					}
//		     	        System.out.println("Leagues starting on or after " + reportDate + ":");
//		     	        for (League league : leaguesReport) {
//		     	            System.out.println(league);
//		     	        }
//		        		break;
//		        	case 3:
//		        		ch=2;
//		        		break;
//	        	}
//	        }
//     }
//}
