package com.app.org;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task 
{
	public static int IdGen;
	private int taskID;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private String status;
	private boolean active;
	public static DateTimeFormatter format;
	
	static 
	{
		IdGen = 100;
		format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	}
	
	public Task(String taskName, String description,LocalDate taskDate) 
	{
		taskID = IdGen++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = "PENDING";
		this.active = true;
	}
	
	public int getTaskID() 
	{
		return taskID;
	}

	public void setTaskID(int taskID) 
	{
		this.taskID = taskID;
	}
	
	public String getTaskName() 
	{
		return taskName;
	}

	public void setTaskName(String taskName) 
	{
		this.taskName = taskName;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public LocalDate getTaskDate() 
	{
		return taskDate;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public boolean isActive() 
	{
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString()
	{
		return "Task [taskID=" + taskID + ", taskName=" + taskName + ", description=" + description + ", taskdate="
				+ format.format(taskDate) + ", status=" + status + ", active=" + active + "]";
	}
	
	/*
	 * @Override public boolean equals(Object obj) { return ; }
	 */
}
