package String;


public class demo {
    public static void main(String[] args) {
        //immutable string
        String str = "Hello, World!";
        System.out.println(str);
        str.concat("bengalaru");
        System.out.println(str);
        //mutable string
        StringBuilder brand1=new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("bengalaru");
        System.out.println(brand1);
    }
    
}
