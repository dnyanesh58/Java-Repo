package custom_exception;

@SuppressWarnings("serial")
public class EmployeeIdNotFoundException extends Exception
{
	public EmployeeIdNotFoundException(String msg)
	{
		super(msg);
	}
}
