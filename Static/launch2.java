
    class demo{
        static void disp1(){
            System.out.println("static disp1");
        }
        void disp2(){
            System.out.println("non staticdisp2");
        }
    }
    public class launch2 {
    
    public static void main(String[] args) {
        demo.disp1();
        demo d=new demo();
        d.disp2();
    }
    
}
