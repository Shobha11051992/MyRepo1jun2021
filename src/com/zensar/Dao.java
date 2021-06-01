package com.zensar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {

	public int addEmployee(String employeeId, String userName, String email) {
		int result = 0;
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			String sql = "insert into employee values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, employeeId);
			pst.setString(2, userName);
			pst.setString(3, email);
			result = pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployeesList = new ArrayList<Employee>();
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			String sql = "select * from employee";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String employeeId = rs.getString("employeeId");
				String userName = rs.getString("userName");
				String email = rs.getString("email");
				Employee employee = new Employee(employeeId, userName, email);
				allEmployeesList.add(employee);
			}
			
		}catch(Exception e) {
			System.out.println("Exception has occured:"+e);
		}
		
		
		return allEmployeesList;
	}
	
	
}
