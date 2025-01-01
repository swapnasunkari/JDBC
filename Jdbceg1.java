import java.sql.*;
import java.sql.Statement;

public class Jdbceg1 {
    public static void main(String[] args) throws SQLException {
     String query = "create table students( sno int auto_increment, sname varchar(50), branch varchar(20), year int(11), primary key(sno))";
    String insert_query = "insert into students(sname,branch, year )values('Rahul', 'CSE', 2023), ('Rohit', 'IT', 2022), ('Ram', 'ECE', 2021)";
        String sql2="update students set sname='Hanuman' where sno=2";

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice","root", "2401");
        Statement st = conn.createStatement();

        try{
            st.executeUpdate(sql2);
            System.out.println("updated successfully");
        }
        catch (Exception e){
            System.out.println("not updated ");
        }
      int rows =  st.executeUpdate(insert_query);
      try{
        st.executeUpdate(query);
        System.out.println("Table created successfully");
      }
      catch (Exception e){
        System.out.println("Table already exists");
      }
if(rows>0){
  System.out.println("Data inserted successfully");
}
else{
    System.out.println("Data not inserted");
}
        st.close();
        conn.close();

}}
