import java.sql.*;
import java.sql.Statement;

public class Jdbcselect {
    public static void main(String args[]) throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcpractice","root","2401");
        Statement st= conn.createStatement();
        String query= "select * from students";
       ResultSet rs = st.executeQuery(query);
       while(rs.next()){
           int Sno= rs.getInt("sno");
           String Sname= rs.getString("sname");
           String Branch= rs.getString("branch");
           int Year= rs.getInt("year");
           System.out.println(" sno "+Sno+" sname "+Sname+" branch "+Branch+" year "+Year);

    }
        String query1= "select count(*) from students";
        ResultSet rs1= st.executeQuery(query1);
        rs1.next();
        int count= rs1.getInt(1);
        System.out.println("Total number of students: "+count);

        String query2= "select sname from students where sno=1";
        ResultSet rs2= st.executeQuery(query2);
        rs2.next();
        String name= rs2.getString("sname");

        System.out.println("Name of the student: "+name);

        String query3= "select sname from students";
        ResultSet rs3= st.executeQuery(query3);
        while(rs3.next()){
            String name1= rs3.getString("sname");
            System.out.println("Name of the student: "+name1);
        }

        st.close();
        conn.close();

}}
