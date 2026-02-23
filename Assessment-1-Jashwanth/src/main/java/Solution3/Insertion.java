package Solution3;

import java.sql.*;

public class Insertion {
    public static void main(String[] args) throws Exception{
        String insert_sql = "insert into student(studentId, studentName, Branch) VALUES (?, ?, ?)";
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/assessment", "root", "root");
                PreparedStatement insert_pst = conn.prepareStatement(insert_sql);
        ){
            insert_pst.setInt(1, 100);
            insert_pst.setString(2, "Ramesh");
            insert_pst.setString(3, "CSE");
            insert_pst.addBatch();

            insert_pst.setInt(1, 101);
            insert_pst.setString(2, "Suresh");
            insert_pst.setString(3, "IT");
            insert_pst.addBatch();

            insert_pst.setInt(1, 102);
            insert_pst.setString(2, "Vignesh");
            insert_pst.setString(3, "ECE");
            insert_pst.addBatch();

            insert_pst.setInt(1, 103);
            insert_pst.setString(2, "Rajesh");
            insert_pst.setString(3, "CSC");
            insert_pst.addBatch();

            insert_pst.setInt(1, 104);
            insert_pst.setString(2, "Kamesh");
            insert_pst.setString(3, "CSE");
            insert_pst.addBatch();

            insert_pst.executeBatch();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
