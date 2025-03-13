import java.net.*;
public class URLDemo{
public static void main(String[]args){
try{
URL url=new URL("http://en.wikipedia.org/wiki/Computer_network");
System.out.println("Protocol:"+url.getProtocol());
System.out.println("Host Name:"+url.getHodt());
System.out.println("Port Name:"+url.getPort());
System.out.println("File Name:"+url.getFile());
}catch(Exceptione){System.out.println(e);}
}
}
