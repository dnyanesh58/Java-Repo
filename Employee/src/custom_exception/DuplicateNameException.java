package custom_exception;

@SuppressWarnings("serial")
public class DuplicateNameException extends Exception
{
	public DuplicateNameException(String msg)
	{
		super(msg);
	}
}
