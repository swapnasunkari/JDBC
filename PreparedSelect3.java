import java.sql.*;

public class PreparedSelect3 {
    public static void main(String args[]) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice","root", "2401");
        String query = "select sname from students where branch=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,"CSE");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            String name = rs.getString("sname");
            System.out.println("Name of the student: "+name);
        }
        ps.close();
        conn.close();

    }
}
