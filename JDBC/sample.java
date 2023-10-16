/*

Steps to connect with mysql server in java : 

1. importing the module  ====>java.sql
2. loading and register the driver ====> com.jdbc.
3. creating a  connection to the appropriate database
4. creating a statement to put our queries in that statement to execute
5. executing the query to process the data using the statement
6. closing  the statement and connection


*/

import java.sql.*; // Step 1

class sample {
	public static void main(String[] args) throws Exception {
		Class.forName(
				"com.mysql.cj.jdbc.Driver"); // Step 2
		String url = "jdbc:mysql://localhost:3306/java"; // Step 3
		String username = "root";
		String password = "";
		String query = "insert into test values ('Hari',19,130,'NAGAI')";
		Connection con = DriverManager.getConnection(
				url, username, password);
		System.out.println(
				"Connection Established successfully");
		Statement st = con.createStatement(); // Step 4
		st.executeUpdate(query); // Step 5
		System.out.println("Data Inserted....");
		st.close(); // Step 6
		con.close();

		System.out.println("Connection Closed....");
	}
}