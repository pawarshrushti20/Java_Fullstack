package Abstractex;

abstract class vehical
{
    abstract void start();
    abstract void stop();
    
}

public class Vehicl {
    public static void main(String[] args) {
        vehical v=new vehical() {
            public void start()
            {
                System.out.println("bike started");
            }
            public void stop()
            {
                System.out.println("stop bike");
            }
        };
      
        v.start();
        v.stop();
    }
    
}

