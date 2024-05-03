//package persitencetier;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import businesstier.DataSource;
//
//public class Batchexecute {
//
//    public static void main(String[] args) {
//        Connection con = null;
//        PreparedStatement pstmt = null;
//        
//        try {
//          
//            con = DataSource.getConnection();
//            String sql = "INSERT INTO user(id, name) VALUES (?, ?)";
//            pstmt = con.prepareStatement(sql);
//            
//         
//            pstmt.setString(1, "1");
//            pstmt.setString(2, "a");
//            pstmt.addBatch();
//            
//            pstmt.setString(1, "2");
//            pstmt.setString(2, "b");
//            pstmt.addBatch();
//            
//            
//            int[] result = pstmt.executeBatch();
//            
//         
//            for (int i : result) {
//                System.out.println("Affected rows: " + i);
//            }
//            
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (pstmt != null) {
//                    pstmt.close();
//                }
//                if (con != null) {
//                    con.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
