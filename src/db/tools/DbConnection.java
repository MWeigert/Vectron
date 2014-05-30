/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package db.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which establish a connection to DB server
 * 
 */
public class DbConnection {
	
	public Connection getConnection() throws SQLException {

	    Connection conn = null;
	    // Enter Userdetails here 
	    String userName = "XXX";
	    String pwd = "XXX";

	    String url = "jdbc:sqlserver://192.168.8.23\\SERVM011:1434;databaseName=POSKassen";
	    try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Dobby catched a " + e + "master should give Dobby a commendation.");
		}
	    conn = DriverManager.getConnection(url, userName, pwd);
	    
	    System.out.println("Connected to database");
	    return conn;
	}

}