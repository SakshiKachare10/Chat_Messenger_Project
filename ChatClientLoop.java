import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ChatClientLoop
{
    public static void main(String A[]) throws Exception
    {
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Client gets connected with server successfully...");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------------Client-----------------------");
        System.out.println("--------------------------------------------------------");

        String str1 = null , str2 = null;
        System.out.println("Enter message for server :");
        FileWriter fobj = new FileWriter("chatlog.txt", true);
        PrintWriter log = new PrintWriter(fobj);
        while(!(str1 = bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says : "+str2);
            System.out.println("Enter message for server :");
        }
    }
}