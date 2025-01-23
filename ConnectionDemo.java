import java.sql.*;
public class ConnectionDemo
{
    public static void main(String []args)
    {
        try
        {
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","");
System.out.println("Connnection SuccessFull!");

        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}