package ThreadEx;

class printvalue extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread .sleep(100);
                System.out.println(i);
            }
            catch(Exception e)
            {

            }
        }
    }
}

class printvalue2 extends Thread
{
    public void run()
    {
        for(int i=11;i<20;i++)
        {
            try
            {
                Thread .sleep(100);
                System.out.println(i);
            }
            catch(Exception e)
            {

            }
        }
    }
}

public class MultipalThreadEx {
    public static void main(String[] args) {

       /*  Runnable r=()->
        {
            for(int i=0;i<10;i++)
            {
                try
                {
                    Thread .sleep(100);
                System.out.println(i);
                }
                catch(Exception e)
                {

                }
            }
        };
        Thread t=new Thread(r);
        t.start();
        */
       printvalue val=new printvalue();
       printvalue2 val2=new printvalue2();
       val.start();
       val2.start();
    }
}

