package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;

public class JDBCReadTableDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/reva","root","1234");
        System.out.println("Connection Established Successfully!!!");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students;");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
