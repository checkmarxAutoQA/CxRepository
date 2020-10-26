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
	     //test22223333344446666667777888899994440009998888999cvcxcvxcv9xcvxcvddd4deee5tttt90909ttttttt
	     //111666
	     ///LizaHF14dddddddd
	   
	     

	 }

	public void high(TextBox tb)
	{
		string input = Console.ReadLine();
		tb.Text = input;
	}

}
