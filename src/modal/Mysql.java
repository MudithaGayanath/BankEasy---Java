package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

    private static Connection con;

    public static void createConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_easy", "root", "Gaiyapilot@9453");
        }
    }

    public static ResultSet search(String query) throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return con.createStatement().executeQuery(query);
    }
    public static int iud(String query)throws ClassNotFoundException,SQLException{
        Mysql.createConnection();
        return con.createStatement().executeUpdate(query);
    }

    /**
     *
     * @param query
     * @return primeryKey
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Long inertAndGetKey(String query) throws ClassNotFoundException, SQLException{
        Mysql.createConnection();
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
         ps.executeUpdate();
         ResultSet rs =  ps.getGeneratedKeys();
         if ( rs.next()){
            return rs.getLong(1);
         }
         return null;
    }
}
