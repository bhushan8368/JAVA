public class launch1{
     static int age;
     static{
        age=12;
        System.out.println("static block first");
        System.out.println(age);

     }
     static void disp(){
        System.out.println("static method main ke badh jab hum call karenge");
     }
    public static void main(String [] args){
        System.out.println("main method");
        disp();
    }
}