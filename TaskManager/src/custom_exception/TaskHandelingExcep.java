package custom_exception;

@SuppressWarnings("serial")
public class TaskHandelingExcep extends Exception
{
	public TaskHandelingExcep(String mesg)
	{
		super(mesg);
	}
}
