package ThreadEx;
class A1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(100);
                System.out.println(i);
            }
            catch(Exception e)
            {

            }
        }
    }
}

public class MultipalThread {
    public static void main(String[] args) {
        A1 a=new A1();
        Thread t=new Thread(a);
        t.start();
    }

}
