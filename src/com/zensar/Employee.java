package com.zensar;

public class Employee {

	private String employeeId;
	private String userName;
	private String email;
	public Employee(String employeeId, String userName, String email) {
		super();
		this.employeeId = employeeId;
		this.userName = userName;
		this.email = email;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
}
