import java.io.*;
import java.net.Socket;
import java.util.*;

public class client {
    public static void main(String[] args)
    {
        Socket socket = null;
        InputStreamReader input = null;
        OutputStreamWriter output;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("localhost", 1234);     //socket is used to share data using their info like port, ip address
            input = new InputStreamReader(socket.getInputStream());     //read the data from server i.e other side  - receive
            output = new OutputStreamWriter(socket.getOutputStream());      //write the data to server i.e other side  - send
            bufferedReader = new BufferedReader(input);     //to speed i/o operation - reading larger block at at time not char by char
            bufferedWriter = new BufferedWriter(output);    //to speed i/o operation - writing larger block at at time not char by char
            Scanner sc = new Scanner(System.in);
            while (true) {

                String msgToServer = sc.nextLine();     //read msg from client
                bufferedWriter.write(msgToServer);  //send the msg to server
                bufferedWriter.newLine();      //will take to new line
                bufferedWriter.flush();     //flush the stream when buffered is full - large files

                System.out.println("Server : " + bufferedReader.readLine());
                if (msgToServer.equalsIgnoreCase("BYE")) {
                    break;
                }
            }
        }
        catch (IOException e) { e.printStackTrace();  }
        finally {
            try{
                if(socket!=null)
                {
                    socket.close();
                }
                if(input!=null)
                {
                    input.close();
                }
                if(bufferedReader!=null)
                {
                    bufferedReader.close();
                }
                if(bufferedWriter!=null)
                {
                    bufferedWriter.close();
                }
            }
            catch (IOException e){ e.printStackTrace();}
        }
    }

}
