import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcupdate {
    public static void main(String[] args) throws Exception {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice", "root", "2401");
            String query = "update students set sname=? where year=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "wonderful");
            ps.setInt(2, 2024);
           ps.addBatch();
            ps.setString(1, "wow");
            ps.setInt(2, 2023);
            ps.addBatch();
            ps.setString(1, "fantastic");
            ps.setInt(2, 2022);
            ps.addBatch();
            int batches[] = ps.executeBatch();
            System.out.println("No of batches executed: " + batches.length);
            ps.close();
                con.close();
    }
}
