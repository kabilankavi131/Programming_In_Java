// File-2 : UDPClient.java
import java.net.*;

class UDPClient 
{
    public static int sPort = 2000;
    public static int cPort = 3000;
    public static int size = 1024;
    public static  DatagramSocket ds;
    public static byte buf[ ] = new byte[size];

	public static void Client() throws Exception
	{
		while(true) 
		{
			DatagramPacket p = new DatagramPacket( buf, buf.length );
			ds.receive (p);
			System.out.println( new String ( p.getData(), 0, p.getLength() ) );
		}
	}

	public static void main( String args[ ] ) throws Exception 
	{
		ds = new DatagramSocket ( cPort );
		Client();
	}
}