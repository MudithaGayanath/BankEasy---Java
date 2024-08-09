package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql {

    private static Connection con;

    public static void createConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_easy", "root", "Gaiyapilot@9453");
        }
    }

    public static ResultSet iud(String query) throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return con.createStatement().executeQuery(query);
    }
    public static int search(String query)throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return con.createStatement().executeUpdate(query);
    }
}
