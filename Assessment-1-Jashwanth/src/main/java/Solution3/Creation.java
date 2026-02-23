package Solution3;

import java.sql.*;

public class Creation {
    public static void main(String[] args) throws Exception{
        String create_sql = "create table student(studentId int, studentName Varchar(30), Branch varchar(30))";
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/assessment", "root", "root");
                PreparedStatement create_pst = conn.prepareStatement(create_sql);
        ){
            create_pst.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
