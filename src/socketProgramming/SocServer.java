package socketProgramming;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class SocServer {

    public static void main(String[] args) throws IOException {

        System.out.println("S : Server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("S : Server is waiting for client request");
        Socket s = ss.accept();//Creates a socket obj once a request has come

        System.out.println("S : Client connected");

        //For us to fetch data
        BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));//Read data from the socket

        String str = br.readLine();
        System.out.println("S : Client  data is : "+str);

        String nickName = str.substring(0,3);
        //Return this value to client machine

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());//It converts your data into a stream format
        //Mention above where you want to send data

        //To actually send data create an object of PrintWriter
        PrintWriter out = new PrintWriter(os);
        out.println(nickName);
        out.flush();
        System.out.println("S : Data sent from server to client");
    }
}
