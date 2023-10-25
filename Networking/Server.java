// Client \u2013 Server program using Socket and 
// ServerSocket class.

// File-1 : Server.java
import java.io.*;
import java.net.*;

public class Server 
{
	public static void main( String[ ] args ) 
	{
		try 
		{
			ServerSocket ss = new ServerSocket(5000);
			Socket sc = ss.accept( );
			
			InputStream is = sc.getInputStream();
			InputStreamReader isr = new InputStreamReader( is );
			BufferedReader in = new BufferedReader( isr );
			PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
			String str = in.readLine();
			out.println(" Application Name : " + str);
			sc.close();
		}
		catch (Exception e) 
		{ }
	}
}