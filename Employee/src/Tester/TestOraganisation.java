package Tester;

import java.util.Scanner;
import static utils.DuplicationNameValidation.*;
import com.app.org.*;

import custom_exception.EmployeeIdNotFoundException;
import static utils.EmployeeIdValidation.validateEmpid;

public class TestOraganisation 
{

	public static void main(String[] args) throws EmployeeIdNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employees to add : ");
		int n = sc.nextInt();
		Employee empdetail[] = new Employee[n];
		int index = 0;
		System.out.println("----Organisation----");
		System.out.println("1.Hire Manager");
		System.out.println("2.Hire Worker");
		System.out.println("3.DIsplay Employee");
		System.out.println("4.Update Salary Of Employee");
		int ch=0;
		
		do {
				
					System.out.println("Enter your choice : ");
					ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 :
						try
						{
							if (index < empdetail.length) 
							{
								System.out.print("Enter the Employee Details(fname,lname, basic,deptid,bonus) : ");
								String fnme = sc.next();
								String lnme = sc.next();
								validateMgrDuplicateName(fnme, lnme, empdetail);
								Employee e1 = new Manager(fnme,lnme,sc.nextDouble(),sc.nextInt(),sc.nextDouble());
								empdetail[index++] = e1;
							}
							else
							{
								System.out.println("There are no vacancies!!!!!");
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
							System.out.println(e.getMessage());
						}
							
						System.out.println("---------------------------------------------------------");
						break;
						
					case 2 :
						try
						{
							if (index < empdetail.length) 
							{
								System.out.print("Enter the Employee Details(fname,lname,basic,deptid,hrsworked,hrlyrate) : ");
								String fnme = sc.next();
								String lnme = sc.next();
								validateWrkDuplicateName(fnme, lnme, empdetail);
								Employee e2 = new Worker(fnme,lnme,sc.nextDouble(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
								empdetail[index++] = e2;
							}
							else
							{
								System.out.println("There are no vacancies!!!!!");
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
							System.out.println(e.getMessage());
						}
							
						System.out.println("---------------------------------------------------------");
						break;
						
					case 3 :
						for (Employee employee : empdetail) 
						{
							if(employee != null)
							{
								System.out.println(employee.toString());
								if(employee instanceof Manager)
								{
									System.out.println("Net Salary : "+((Manager)employee).computeSal());
								}
								if(employee instanceof Worker)
								{
									System.out.println("Net Salary : "+((Worker)employee).computeSal());
								}
								System.out.println("---------------------------------------------------------");
							}
						}
						break;
						
					case 4:
						try 
						{
							System.out.println("Enter Employee Id of  Employee:");
							int epid = sc.nextInt();
							int id= validateEmpid(empdetail,epid);
							if (empdetail[id].getEmpId() == epid)
							{
								System.out.println("Enter Incremented Salary Of Emp : ");
								double basic = sc.nextDouble();
								System.out.println("Old Salary Of Empid:"+epid+" is "+empdetail[id].getbasic());
								empdetail[id].setBasic(empdetail[id].getbasic()+basic);
							}
						}
						catch (Exception e) 
						{
							e.printStackTrace();
							System.out.println(e.getMessage());
						}	
						break;
				}	
		} while(ch != 0);	
	}

}
