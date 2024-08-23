package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    private static Connection con;

    public static void createConnection() throws ClassNotFoundException, SQLException {
        if (getCon() == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_easy", "root", "Gaiyapilot@9453");
        }
    }

    public static ResultSet search(String query) throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return getCon().createStatement().executeQuery(query);
    }
    public static int iud(String query)throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return getCon().createStatement().executeUpdate(query);
    }

   
}
