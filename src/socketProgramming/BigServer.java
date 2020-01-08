package socketProgramming;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class BigServer {

    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(9997);

        System.out.println("Server ready for chatting");
        Socket s = ss.accept();//Creates a socket obj once a request has come
        //Reading from keyboard
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        //Sending to client(pwrite object)
        OutputStream ostream = s.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        InputStream istream = s.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        String receiveMessage, sendMessage;
        while (true) {
            if ((receiveMessage = receiveRead.readLine()) != null) {
                System.out.println(receiveMessage);
            }
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
        }


    }}