// File-2 : Client.java
// The Client Socket Program.

import java.net.*;
import java.io.*;

class Client 
{
	public static void main( String args[ ] ) throws Exception 
	{
		int ch;
		// IP address of Server PC => 192.168.1.2
		Socket sc = new Socket("192.168.1.2", 5000);
		// Host name of Server PC => PC1
		// or Socket sc = new Socket("PC1", 5000);
		
		InputStream in = sc.getInputStream();
		OutputStream out = sc.getOutputStream();
		String str = "Java Programming Examples.\n";
		byte buf[ ] = str.getBytes();
		out.write(buf);

		while ((ch = in.read()) != -1) 
		{
			System.out.print((char) ch);
		}
		sc.close();
	}
}