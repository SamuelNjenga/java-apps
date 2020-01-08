package socketProgramming;
import java.io.*;
import java.net.Socket;

public class SocClient {

    public static void main(String[] args) throws IOException {

        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip,port);


        //Once connected you will ask your server to do something for you
        String str = "Samuel Njenga";

        //You want to send this data to server side
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());//It converts your data into a stream format
        //Mention above where you want to send data

        //To actually send data create an object of PrintWriter
        PrintWriter out = new PrintWriter(os);
        out.println(str);    //str is sent to server which will process it
        os.flush();//Force fully send data to the server


        BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));//Read data from the socket

        String nickName = br.readLine();
        System.out.println("Data from server : "+nickName);
    }
}

