package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import static com.app.org.Task.IdGen;
import com.app.org.Task;

import custom_exception.TaskHandelingExcep;

public class ValidationRules
{	
	public static boolean validateActive(int taskID,Map<Integer,Task> taskMap) throws TaskHandelingExcep
	{	
		Task foundTask = taskMap.get(taskID);
		if(foundTask.isActive() == true)
			throw new TaskHandelingExcep("Task Is Running cannot be terminated!!!!");
		return true;
	}
	
	public static Task validateTaskId(int taskID,Map<Integer,Task> taskMap) throws TaskHandelingExcep
	{
		Task foundTask = taskMap.get(taskID);
		if(foundTask == null)
			throw new TaskHandelingExcep("Task ID Is Not Valid");
		return foundTask;
	}
}
