import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Preparedselect2 {
    public static void main(String[] args) throws Exception {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice", "root", "2401");
            String sql = "select * from students where sno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 1);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("sno");
                String name = rs.getString("sname");
                String branch = rs.getString("branch");
                int year = rs.getInt("year");
               System.out.println("id "+id+" sname "+name+" branch "+branch+" year "+year);
            }
            stmt.close();
            con.close();

    }
}
