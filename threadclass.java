//threadclass.java

/* printing hi hello parallelly*/

class hi extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("hi");
try{Thread.sleep(100);}catch(Exception e){}
}
}
}
class hello extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("hello");
try{Thread.sleep(100);}catch(Exception e){}
}
}
}

public class threadclass
{
public static void main(String []args)
{
hi h=new hi();
hello hl=new hello();
//to execute any method parallely that method should extend thread class and call wrt obj
//when we call hihelo methods directly first hi() and second hello() is executed ,
//until the execution of first thread second thread is waiting so in order to execcute paralelly 
//we extend thread class for both the methods and call them wrt obj*
h.start();//always thread class internally calls run() ,where logic is written
try{Thread.sleep(100);}catch(Exception e){}
hl.start();
}
}