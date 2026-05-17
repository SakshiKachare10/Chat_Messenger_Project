import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ChatServerLoop
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Client request gets accepted successfully...");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------Server------------------------");
        System.out.println("--------------------------------------------------------");

        String str1 = null , str2 = null;

        try
        {
         FileWriter fobj = new FileWriter("chatlog.txt", true);
         PrintWriter log = new PrintWriter(fobj);    
         while((str1 = bobj1.readLine())!=null)
         {
            if(str1.equals("end"))
            {
               break;
            }
            System.out.println("Client says :"+str1);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String time = LocalDateTime.now().format(dtf);
            log.println("["+time+"] Client : "+str1);
            log.flush();
            System.out.println("Enter message for client :");
            str2 = bobj2.readLine();
            pobj.println(str2);
            log.println("["+time+"] Server : "+str2);
            log.flush();
         }
        } 
        catch(Exception e)
        {
            System.out.println("Connection closed");
        }
    }
}