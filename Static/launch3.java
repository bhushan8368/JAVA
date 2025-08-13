class demo1{
    static int a;
    static int b;

    int m;
    int n;

    static{
        a = 10;
        b = 20;
        System.out.println("control in static block");
    }
    {
        m = 30;
        n = 40;
        System.out.println("control in non static block");
    }
    static void disp1(){
        
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);


    }
    void disp2(){
        System.out.println("value of m is "+m);
        System.out.println("value of n is "+n);
    }
}
public class launch3 {
    public static void main(String[] args) {
        demo1 d = new demo1();
        d.disp1();
        d.disp2();

    }
    
}
