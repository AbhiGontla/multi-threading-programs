//numgendemo.java

import java.util.Scanner;
class numgen extends Thread
{
public void run()
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=Integer.parseInt(s.nextLine());
if(n<=0)
{
System.out.println("enter a positive value");
}
else
{
try
{
System.out.println("number's with  in "+n);
for(int i=1;i<=n;i++)
{
System.out.println("val of i="+i);
Thread.sleep(100);
}
}catch(Exception e)
{
System.err.println(e);
}
}
}
}
public class numgendemo
{
public static void main(String []args)
{
numgen ng=new numgen();
ng.start();
}
}