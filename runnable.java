
//runnable.java
//if any ethod want to extend any another ethod of other class itis not posible
//as java never supports multiple inheritance we gofor runnable interface it contains onlyrun(),we  need to call start method by passing the obj of runnableinterface as parameter to thread
class hi  implements Runnable
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
class hello implements Runnable
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

public class runnable
{
public static void main(String []args)
{
hi h=new hi();
hello hl=new hello();
/* as RI not contain start() we pass the ref of Ri to thread class and we call start() whichinternally calls run() o RI*/
//here the obj of super class=objof its implementation calss

Thread t1=new Thread(h);//ref of runnable intf as parameter
Thread t2=new Thread(hl);
t1.start();
try{Thread.sleep(100);}catch(Exception e){}
t2.start();
}
}