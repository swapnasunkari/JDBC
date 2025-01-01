import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbcpreparedselect {
    public static void main(String args[]) throws Exception {
        String query = "select * from students";

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice", "root", "2401");
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sno= rs.getInt("sno");
                String sname= rs.getString("sname");
                String branch= rs.getString("branch");
                int year= rs.getInt("year");
                System.out.println("sno "+sno+" sname "+sname+" branch "+branch+" year "+year);
            }
            ps.close();
            con.close();

    }
}
