
package databasehandlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jedabero
 *
 */
public class Database {

	private String databaseName;
	private String url = "jdbc:mysql://localhost:3306";
	private String user;
	private String password;
	
	private Connection baseCon;
	private PreparedStatement createTableSt; 
	
	public Database(String databaseName, String user, String password){
		this.databaseName = databaseName;
		this.user = user;
		this.password = password;
		
		
		
	}
	
	private void init(){
		try {
			baseCon = DriverManager.getConnection(url+databaseName, user, password);
			//createTableSt = baseCon.prepareStatement(sql)
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
