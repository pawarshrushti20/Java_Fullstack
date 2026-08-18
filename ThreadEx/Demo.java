package ThreadEx;

class A extends Thread
{
    public void run()
    {
       /*  for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println("handled");
            }
        }*/
       System.out.println(Thread.currentThread().getName());
    }

}


public class Demo {
    public static void main(String[] args) {
      /*   Thread t=new Thread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        */
       Thread t=new Thread();
       A a=new A();
       a.start();
       System.out.println(Thread.currentThread().getName());
       System.out.println(a.getName());
       System.out.println(t.getName());
       System.out.println();
       
    }

}
