package Solution3;

import java.sql.*;

public class Selection {
    public static void main(String[] args) throws Exception{
        String select_sql = "select * from student";
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/assessment", "root", "root");
                PreparedStatement select_pst = conn.prepareStatement(select_sql);
        ){
            ResultSet rs = select_pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
