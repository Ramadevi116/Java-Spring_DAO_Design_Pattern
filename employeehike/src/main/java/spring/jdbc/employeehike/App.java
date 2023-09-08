package spring.jdbc.employeehike;
import spring.jdbc.employeehike.business.EmployeeBusinessImpl;
import spring.jdbc.employeehike.business.EmployeeBusiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl) context.getBean("employeeBusiness"); 
        employeeBusiness.printEmployeeHikes();
    }
}
