
class calc{
    public void show(int n){
        System.out.println("int"+n);
    }
    public void show(byte n){
        System.out.println("byte"+n);
    }
    public void show(short n){
        System.out.println("short"+n);
    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(double n){
        System.out.println("double"+n);
    }
}
public class demo2{
public static void main(String[] args) {
        calc c = new calc();
        c.show(10);
        byte b=2;
        c.show(b);
        

    }
}
