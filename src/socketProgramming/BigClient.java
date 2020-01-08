package socketProgramming;
import java.io.*;
import java.net.Socket;

public class BigClient {

    public static void main(String[] args) throws IOException {

        String ip = "localhost";
        int port = 9997;
        Socket s = new Socket(ip, port);
        //reading from keyboard
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        //Sending to client(pwrite object)
        OutputStream ostream = s.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        //Receiving from server(receiveRead object)
        InputStream istream = s.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        System.out.println("Start the chitchat,type and press enter key");

        String receiveMessage, sendMessage;

        while (true) {
            sendMessage = keyRead.readLine();//Keyboard reading
            pwrite.println(sendMessage);//Sending to server
            pwrite.flush(); //flush the data

            if ((receiveMessage = receiveRead.readLine()) != null)//Receive from server
            {
                System.out.println(receiveMessage);//Displaying at DOS prompt
            }

        }


    }
}



