
package databasehandlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author jedabero
 *
 */
public class Database {

	private String databaseName;
	private String url = "jdbc:mysql://localhost:3306/";
	private String user;
	private String password;
	
	private Connection baseCon;
	private PreparedStatement showTables;
	private ArrayList<String> tableNames = new ArrayList<String>();
	
	public Database(String databaseName, String user, String password){
		this.databaseName = databaseName;
		this.user = user;
		this.password = password;
		
		init();
		
		
	}
	
	private void init(){
		
		try {
			baseCon = DriverManager.getConnection(url+databaseName, user, password);
			showTables = baseCon.prepareStatement("SHOW TABLES");
			
			java.sql.ResultSet rs = showTables.executeQuery();
			while(rs.next()){
				tableNames.add(rs.getString(1));
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.out.println(sqle.getMessage());
		}
		
	}
	
	
	
}
