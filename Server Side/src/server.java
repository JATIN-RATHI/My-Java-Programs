import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) throws IOException {
        Socket socket;
        InputStreamReader input;
        OutputStreamWriter output;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        ServerSocket serverSocket;       //receives the connection of client

        serverSocket = new ServerSocket(1234);      //accept clients matches port 1234

        while (true) {
            try {
                socket = serverSocket.accept();     //accepts the connection if matches
                input = new InputStreamReader(socket.getInputStream());
                output = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(input);
                bufferedWriter = new BufferedWriter(output);

                while (true) {
                    String msgFromClient = bufferedReader.readLine();       //store msg from client
                    System.out.println("Client : " + msgFromClient);           //print msg
                    bufferedWriter.write("Msg received");               //send msg to client
                    bufferedWriter.newLine();               //new line at client side
                    bufferedWriter.flush();                 //after msg received by client flush the buffer
                    if (msgFromClient.equalsIgnoreCase("BYE")) {
                        break;
                    }
                }
                socket.close();     //when received bye from client than socket for that client will close i.e connection will close
                input.close();
                output.close();
                bufferedReader.close();
                bufferedWriter.close();
            }
            catch (IOException e){e.printStackTrace(); }
        }
    }
}
