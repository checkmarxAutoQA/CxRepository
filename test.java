public class SQLInjection
{
     public static void main (String [] argds)
	 {
		String accountNumber = args[1];
		String query = "SELECT * FROM user_data WHERE acountNumber = " + accountNumber; 
		
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet results = statement.executeQuery(query);

		 high(new TextBox());
	     //test1111199999
	     //test222233333444466666677778888999944400099988889999ddd4deee5tttt90909ttttttt
	     //111666

	 }

	public void high(TextBox tb)
	{
		string input = Console.ReadLine();
		tb.Text = input;
	}

}
