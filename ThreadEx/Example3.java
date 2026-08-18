package ThreadEx;

class counter
{
    int count=0;
     synchronized void increment()
    {
        count++;
    }
}
class mythread extends Thread
{
    counter counter;
    public mythread(counter counter)
    {
        this.counter=counter;
    }
    public void run()
    {
    for(int i=0;i<100;i++)
    {
        counter.increment();

    }
}
}
public class Example3 {
    public static void main(String[] args) {
        counter counter=new counter();
        System.out.println(counter.count);
        mythread my=new mythread(counter);
        mythread my1=new mythread(counter);
        my.start();
        my1.start();
        try
        {
            my.join();;
            my.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(counter.count);

        
    }

}
