import java.net.*;
public class PortScanner
{
public static void main(String args[])
{
int startPortRange=0;
int stopPortRange=65365;
for(int i=startPortRange;i<=stopPortRange;i++)
{
try
{
Socket ServerSok=new Socket("127.0.01",i);
System.out.println("Post in use:"+i);
ServerSok.close();
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Port not in use:"+i);
}
}
}
