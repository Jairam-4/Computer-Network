import java.net.*;
import java.*;
class ipaddr
{
    public static void main(String args[])
    throws UnknownHostException
    {
        String s="https://www.yahoo.com/";
        try
        {
            InetAddress ip=InetAddress.getByName(new URL(s).getHost());
            System.out.println("public IP Address of:"+ip);
        }
        catch(MalformedURLException e)
        {
            System.out.println("invalid URL");
        }
    }
}
