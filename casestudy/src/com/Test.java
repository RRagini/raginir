package com;

import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
	Empdao d=new Empdao();
	public int add(Employee e) throws ClassNotFoundException, SQLException{
		 return d.add(e);
		
		
	}
	public ArrayList<Employee> search(String name) throws ClassNotFoundException, SQLException{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list=d.search(name);
		return list;
	}

}
