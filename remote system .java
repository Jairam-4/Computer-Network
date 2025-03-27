import java.net.Socket;

public class PortScanner
{
    public static void main(String[] args) 
    {
        int startPortRange = 1; // Usually, ports 0-1023 are reserved
        int stopPortRange = 65535;

        for (int i = startPortRange; i <= stopPortRange; i++) 
        {
            try 
            {
                Socket serverSocket = new Socket("127.0.0.1", i);
                System.out.println("Port in use: " + i);
                serverSocket.close();
            } catch (Exception e) 
            {
                // Do not print stack trace for closed ports
                System.out.println("Port not in use: " + i);
            }
        }
    }
}
