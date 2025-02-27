import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            String s = "https://www.example.com";
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

