import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Callablestmts {
    public static void main(String args[]) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice","root", "2401");
        CallableStatement stmt = conn.prepareCall("{call addNumbers(?,?,?)}");
        stmt.setInt(1, 59);
        stmt.setInt(2,234);
        stmt.registerOutParameter(3, Types.INTEGER);
        stmt.execute();
        int sum = stmt.getInt(3);
        System.out.println("Sum  is: " + sum);
        stmt.close();
            conn.close();

    }

}
