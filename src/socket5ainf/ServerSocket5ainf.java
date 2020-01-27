package socket5ainf;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ServerSocket5ainf
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(2000);
            System.out.println("In attesa di connessione...");
            
            ThreadClass tc = new ThreadClass();
            tc.run();
            Socket socket = serverSocket.accept();
            
            System.out.println("Connessione stabilita.");
            System.out.println("Socket server: " + socket.getLocalSocketAddress());
            System.out.println("Socket client: " + socket.getRemoteSocketAddress());
        }
        catch (IOException ex)
        {
            System.err.println("Erroe di I/O.");
            
        }
        
    }
}