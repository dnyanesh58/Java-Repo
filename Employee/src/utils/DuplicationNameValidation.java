package utils;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

import custom_exception.DuplicateNameException;

public class DuplicationNameValidation 
{
	
	public static void validateMgrDuplicateName(String fnme,String lnme,Employee[] emp) throws DuplicateNameException
	{
		Manager newmgr = new Manager(fnme,lnme);
		for (Employee employee : emp)
		{
			if (employee != null && employee.equals(newmgr)) 
			{
				throw new DuplicateNameException("Duplicate Name Found ");
			}
		}
	}
	
	public static void validateWrkDuplicateName(String fnme,String lnme,Employee[] emp) throws DuplicateNameException
	{
		
		Worker newwrk = new Worker(fnme, lnme);
		for (Employee employee : emp) 
		{
			if (employee != null && employee.equals(newwrk))
			{
				throw new DuplicateNameException("Duplicate Name Found ");
			}
		}
	}
}	

