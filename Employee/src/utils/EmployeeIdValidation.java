package utils;
import com.app.org.Employee;

import custom_exception.EmployeeIdNotFoundException;
public class EmployeeIdValidation 
{
	public static int empid;
	
	public static int validateEmpid(Employee[] emp,int id) throws EmployeeIdNotFoundException
	{
		for (int i = 0; i < emp.length; i++) 
		{
			if(emp[i] != null)
			{
				if(emp[i].getEmpId() == id)
				{
					empid = i;
				}
				else
				{
					throw new EmployeeIdNotFoundException("Not valid Employee Id");
				}
			}
		}
		return empid;
	}
}
