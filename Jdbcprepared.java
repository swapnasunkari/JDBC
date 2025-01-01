import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcprepared {
    public static void main(String[] args) throws Exception {


            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice", "root", "2401");
            PreparedStatement ps = con.prepareStatement("insert into students(sname, branch, year) values(?,?,?)");
            ps.setString(1, "swapna");
            ps.setString(2, "cse");
            ps.setInt(3, 2024);
            ps.addBatch();

            ps.setString(1, "sai");
                ps.setString(2, "ece");
                ps.setInt(3, 2023);
                ps.addBatch();

                ps.setString(1, "ram");
                ps.setString(2, "it");
                ps.setInt(3, 2022);
                ps.addBatch();

              int Batches[] = ps.executeBatch();
                System.out.println("No of batches executed: " + Batches.length);
                ps.close();
                con.close();
    }

}
