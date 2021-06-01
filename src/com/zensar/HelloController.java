package com.zensar;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloController extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String methodToCall = request.getParameter("methodToCall");
		
		if(methodToCall.equalsIgnoreCase("addEmployee")) {
			// logic for add a new Employee
			System.out.println("Logic to add a new Employee will be called...");
		String employeeId = request.getParameter("employeeId");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		System.out.println("employeeId "+employeeId);
		System.out.println("userName "+userName);
		System.out.println("email "+email);
		
		Dao dao = new Dao();
		int result = dao.addEmployee(employeeId, userName, email);
		
		request.setAttribute("employeeId", employeeId);
		request.setAttribute("userName", userName);
		request.setAttribute("email", email);
		
		
		try {
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		else if(methodToCall.equalsIgnoreCase("getAllEmployees")) {
			// logic for viewAll Employees
			System.out.println("Get All Employees logic will be executed in Controller ....");
			Dao dao = new Dao();
			List<Employee> allEmployeesList = dao.getAllEmployees();
			System.out.println(allEmployeesList);
			
			request.setAttribute("allEmployeesList", allEmployeesList);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllEmployees.jsp");
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
