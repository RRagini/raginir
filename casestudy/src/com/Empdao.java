package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Empdao {
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	static final String DB_URL = "jdbc:oracle:thin:@inchnilpdb03.India.TCS.com:1521:JAVADB03";
	static final String USER = "E1188040";
	static final String PASS = "E1188040";
	static Connection con=null;
	static Statement st=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	
public int add(Employee e) throws SQLException, ClassNotFoundException{
	int i=0;
	Class.forName(JDBC_DRIVER);
	con=DriverManager.getConnection(DB_URL, USER, PASS);
	System.out.println("Connecting to database...");
	ps=con.prepareStatement("insert into employees values(?,?,?,?)");
	ps.setInt(1, e.getId());
	ps.setString(2, e.getName());
	ps.setString(3, e.getEmail());
	ps.setString(4, e.getTechnology());
	i=ps.executeUpdate();
	return i;
}
public ArrayList<Employee> search(String name) throws SQLException, ClassNotFoundException{
	Class.forName(JDBC_DRIVER);
	con=DriverManager.getConnection(DB_URL, USER, PASS);
	st=con.createStatement();
	rs=st.executeQuery("select * from employees where name="+"'"+name+"'");
	ArrayList<Employee> list=new ArrayList<Employee>();
	while(rs.next()){
	Employee e=new Employee();
	e.setId(rs.getInt(1));
	e.setName(rs.getString(2));
	e.setEmail(rs.getString(3));
	e.setTechnology(rs.getString(4));
	list.add(e);
	
}
	return list;
}
}