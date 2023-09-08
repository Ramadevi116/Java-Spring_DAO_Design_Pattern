package spring.jdbc.employeehike.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import spring.jdbc.employeehike.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAllEmployees() {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/springjdbc";
		String userid="root";
		String pwd="sql834";
		List<Employee> employees=new ArrayList<Employee>();
		
		    try {
				Class.forName(Driver);
				Connection con=DriverManager.getConnection(url,userid,pwd);
				Statement stmt=con.createStatement();
				ResultSet res=stmt.executeQuery("select * from employee");
				while(res.next()) {
			    	String id=res.getString(1);
			    	String name=res.getString(2);
			    	int exp=res.getInt(3);
			    	Employee employee=new Employee(id,name,exp);
			    	employees.add(employee);
			    }
				
				con.close();
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
