import java.io.IOException;

public class Class_Code_Injection {
	public void Code_Injection(WebSession s) throws ParameterNotFoundException
	{
		String name = s.getRequest();
		try {
		   System.loadLibrary(name);
		   System.load(name);
		} 
		catch (UnsatisfiedLinkError e) {
		   e.printStackTrace();
		}
	}
}