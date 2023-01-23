package Tester;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import static utils.TaskUtils.*;
import com.app.org.Task;

import custom_exception.TaskHandelingExcep;

import static com.app.org.Task.IdGen;
import static utils.ValidationRules.*;
public class TestTaskManager 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			HashMap<Integer,Task> taskMap = (HashMap<Integer,Task>)populateTasks();
			System.out.println("1.Add New Task");
			System.out.println("2.Delete a task");
			System.out.println("3.Update task status");
			System.out.println("4.Display all pending tasks");
			System.out.println("5.Display all pending tasks for today");
			System.out.println("6.Display all tasks sorted by taskDate");
			
			boolean flag = true;
			while (flag)
			{
				System.out.print("Enter the choice : ");
				try
				{
					switch (sc.nextInt())
					{
					case 1:
						System.out.println("Enter Task Details : (taskName,description,taskDate(year-month-day)) : ");
						Task newTask = new Task(sc.next(),sc.next(),LocalDate.parse(sc.next()));
						taskMap.put(IdGen, newTask);
						System.out.println("New task Added");
						break;
						
					case 2:
						System.out.println("Enter The Task Id :"); 
						System.out.println(taskRemove(sc.nextInt(), taskMap)); 
						 break;
						
					case 3:
						System.out.println("Enter Task Id & New Status : ");
						taskStatus(sc.nextInt(),sc.next().toUpperCase(), taskMap);
						break; 
						
					case 4:
						pendingStatus("PENDING", taskMap);
						break;
						
					case 5:
						pendingStatusForToday("PENDING", taskMap);
						break;
						
					case 6:
						ArrayList<Task> taskList = new ArrayList<Task>();
						taskList.addAll(taskMap.values());
						
						 Collections.sort(taskList, new Comparator<Task>() 
						 {

							@Override
							public int compare(Task o1, Task o2)
							{
								return o1.getTaskDate().compareTo(o2.getTaskDate());
							}
							   
						  });
			 			 
						 for (Task task : taskList) 
							{
								System.out.println(task);
							}
						break;
						
					case 7 :
						flag = false;
						break;
						
					default:
						flag = false;
						break;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
