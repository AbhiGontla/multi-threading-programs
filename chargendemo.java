import java.util.Scanner;
class chargen implements Runnable
{
public void run()
{
Scanner s=new Scanner(System.in);
System.out.println("enter a line of text");
String text=s.nextLine();
try{
	for(int i=0;i<=text.length();i++)
	{
	char ch=text.charAt(i);
	System.out.println(ch);
	Thread.sleep(500);
	}
    }
catch(InterruptedException ie)
{
System.err.println("prob in thread excep");
}
catch(StringIndexOutOfBoundsException se)
{
System.err.println("string length more");
}

}
}
public class chargendemo
{
public static void main(String []args)
{
chargen cg=new chargen();
Thread t=new Thread(cg);
t.start();
}
}