//DSender.java
import.java.net.*;
public class DSender{
public static void main(String[]args)throws Exception{
DatagramSocket ds=new DatagramSocket(3000);
String str="Welcome Pradeep";
InetAddress ip=InetAddress.getByName("127.0.0.1");
DataramPacket dpn=new DatagramPacket(str.getBytes(),str.length()0,ip,3000);
ds.send(dp);
ds.close();
}
}
