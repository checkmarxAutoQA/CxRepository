public class SQLInjection
{
     public static void main (String [] args)
	 {
		String accountNumber = args[1];
		String query = "SELECT * FROM user_data WHERE acountNumber = " + accountNumber; 
		
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet results = statement.executeQuery(query);

		 high(new TextBox());
	     //test11111
	     //test2222333334444666666777788889999

	 }

	public void high(TextBox tb)
	{
		string input = Console.ReadLine();
		tb.Text = input;
	}

}
