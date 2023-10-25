// Write a Client \u2013 Server program using 
// DatagramPacket and DatagramSocket class.


// File-1 : UDPServer.java
import java.net.*;

class UDPServer 
{
	public static int sPort = 2000;
	public static int cPort = 3000;
	public static int size = 1024;
	public static  DatagramSocket ds;
	public static byte buf[ ] = new byte[size];

	public static void Server() throws Exception 
	{
		int pos =0;
 
		while (true) 
		{
			int c = System.in.read();
			switch (c) 
			{
				case -1:
				    System.out.println("Server Quits");
				    return;
				case '\n':
				    ds.send(new DatagramPacket (buf, pos, InetAddress.getLocalHost(), cPort) );
				    pos = 0;
				    break;
				default:
					buf[pos++] = (byte) c;
			}
		}
	}

	public static void main( String args[ ] ) throws Exception 
	{
		ds = new DatagramSocket (sPort);
		Server();
	}
}

