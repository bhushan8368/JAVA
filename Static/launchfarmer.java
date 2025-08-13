import java.util.*;
class farmer{
    int pa;
    float td;
    static float ri;
    float si;
    
    static{
        ri=0.1f;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please mention the amount required ");
        pa=sc.nextInt();
        System.out.println("please mention the time duration ");
        td=sc.nextFloat();
        

    }
    void compute(){
        si=(pa*ri*td)/100;
    }
    void display(){
        System.out.println("the simple interest is "+si);
    }
}
    public class launchfarmer{
    public static void main(String[] args) {
        farmer f1=new farmer();
        f1.input();
        f1.compute();
        f1.display();
    }

}