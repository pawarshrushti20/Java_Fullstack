package InnerclassEx;
class A{
    int a=10;
    void show()
    {
        System.out.println(" the value of a="+a);
    }
    static class  B {
        int a=20;
        void show()
    {
        System.out.println(" the value of a"+a);
    }
    class C
    {

        int a=30;
        void show()
    {
        System.out.println(" the value of a"+a);
    }
    }
        
    }
}
public class Innerclassex {
    public static void main(String[] args) {
        A a=new A();
        a.show();
        A.B b=new A.B();
        b.show();
       /*  A.C c=new A().new C();  non static class 
        A.C c2=a.new C();
        c.show();*/

    }

}
