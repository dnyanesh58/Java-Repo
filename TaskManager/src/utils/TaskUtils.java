package utils;

import static com.app.org.Task.IdGen;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

import com.app.org.Task;

import custom_exception.TaskHandelingExcep;

import static utils.ValidationRules.*;
public class TaskUtils 
{
	public static Map<Integer, Task> populateTasks() throws DateTimeParseException
	{
		Map<Integer,Task> taskMP = new HashMap<Integer, Task>();
		taskMP.put(IdGen,new Task("Chrome","Web Application",LocalDate.parse("2022-11-20")));
		taskMP.put(IdGen,new Task("Notepad","Utility Services",LocalDate.parse("2022-11-20")));
		taskMP.put(IdGen,new Task("Spring Tool Suite","Java IDE",LocalDate.parse("2022-11-20")));
		taskMP.put(IdGen,new Task("Visual Studio Code","C/C++ IDE ",LocalDate.parse("2022-11-19")));
		taskMP.put(IdGen,new Task("Excel","MS Office Services",LocalDate.parse("2022-11-18")));
		taskMP.put(IdGen,new Task("Eclipse","Java IDE",LocalDate.parse("2022-11-21")));
		return taskMP;
	}
	
	public static void taskStatus(int taskId,String status,Map<Integer,Task> taskMP) throws TaskHandelingExcep
	{
		Task foundTask = validateTaskId(taskId, taskMP);
		foundTask.setStatus(status);	
		System.out.println("Status Updated Succesfully");
	}
	
	public static Task taskRemove(int taskId,Map<Integer,Task> taskMP) throws TaskHandelingExcep
	{
		Task foundTask = validateTaskId(taskId, taskMP);
		return taskMP.remove(foundTask.getTaskID());
	}
	
	public static void pendingStatus(String status,Map<Integer,Task> taskMP)
	{
		for (Task task : taskMP.values()) 
		{
			if (task.getStatus().equals(status))
			{
				System.out.println(task);
			}
		}
	}
	
	public static void pendingStatusForToday(String status,Map<Integer,Task> taskMP) throws TaskHandelingExcep
	{
		for (Task task : taskMP.values()) 
		{
			if (task.getStatus().equals(status) && task.getTaskDate().equals(LocalDate.now()))
			{
				System.out.println(task);
			}
		}
	}
}
