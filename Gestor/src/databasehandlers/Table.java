package databasehandlers;

import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Table {
	
	private String name;
	private ArrayList<String> columnName;
	private ArrayList<String> columnType;
	private int numColumns;
	
	private Database parentDB;
	
	public Table(Database parent, String name, ArrayList<String> cols,
			ArrayList<String> coltypes) throws SQLException{
		this.parentDB = parent;
		this.name = name;
		this.columnName = cols;
		this.columnType = coltypes;
		this.numColumns = cols.size();
		
		initTable();
		
	}

	private int initTable() throws SQLException {
		Statement createTable;
		String tn = "CREATE TABLE IF NOT EXISTS "+name+"(";
		for (ListIterator<String> li = columnName.listIterator(); li.hasNext();) {
			int i = li.nextIndex();
			tn +=li.next()+" "+columnType.get(i)+((i<numColumns-1)?",":"");
		}
		tn += ")";
		createTable = parentDB.getBaseCon().prepareStatement(tn);
		return createTable.executeUpdate(tn);
	}
	
	public static void main(String args[]){
		
		Database db = new Database("test", "jedabero", "Obsessed");
		ArrayList<String> alsn = new ArrayList<String>();
		alsn.add("ID");alsn.add("Name");
		ArrayList<String> alst = new ArrayList<String>();
		alst.add("INT");alst.add("VARCHAR(64)");
		db.createTable("ttest", alsn, alst);
		
		
		
	}
	
}
