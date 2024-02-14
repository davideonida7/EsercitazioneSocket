import java.net.*;
import java.io.*;

public class CLient {
    public static void Main (String[] args) throws IDException{
        String hostName ="localHost";
        int port= 12345;


        try (Socket socket = new Socket (hostName, port);
             BufferedReader in = new BufferedReader (
                     new InputStreamReader (socket.getInputStream[]))) {
            String fromServer;
        while ((fromServer = in)).readLIne() != null){
        System.out.println("Server: " + fromServer);
        break;

          }
        }
    }
}