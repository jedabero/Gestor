package databasehandlers;

import java.util.ArrayList;

public class Table {
	
	private String name;
	private ArrayList<String> columnName;
	private ArrayList<String> columnType;
	
	private Database parentDB;
	
	public Table(Database parent, String name,
			ArrayList<String> cols, ArrayList<String> coltypes){
		this.parentDB = parent;
		this.name = name;
		this.columnName = cols;
		this.columnType = coltypes;
		
		
		
	}
	
}
