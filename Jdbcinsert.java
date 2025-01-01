import java.sql.*;

public class Jdbcinsert {
    public static void main(String args[]) throws Exception{
        String url = "jdbc:mysql://localhost:3306/Jdbcpractice";
        String username = "root";
        String password = "2401";
        String sql_query= " insert into employees values(1, 'Rahul', 50000, 'Mumbai')";

        String sql1= "insert into employees values"+ "(2, 'Rohit', 60000, 'Delhi') ,"+
                "(3, 'ram',55000,'Hyd')";

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement st= conn.createStatement();
        st.executeUpdate(sql_query);
        st.executeUpdate(sql1);



        System.out.println("Data inserted successfully");


        st.close();
        conn.close();

    }
}
