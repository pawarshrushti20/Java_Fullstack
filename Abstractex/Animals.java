package Abstractex;

abstract class animal {
    abstract void makesound();
    void eat()
    {
        System.out.println("eating");
    }

    
}
public class Animals {
    public static void main(String args[])
    {
        animal a=new animal() {
            public void makesound()
            {
                System.out.println("dog is saying : bark");
            }
        };
        a.eat();
        a.makesound();
    }

}