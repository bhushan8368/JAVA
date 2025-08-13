class student{
    private int age;
    private String name;

    public void setAge(int age){
        this.age=age;
        
    }
    public void setName(String name ){
        
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    } 
}
public class demo2{
    public static void main(String[] args) {
        student obj = new student();
        student obj1=new student();
        obj.setAge(18);
        obj.setName("bhushan");
        
        obj1.setAge(25);
        obj1.setName("Sakshi");
        System.out.println("Name of first student is "+obj.getName());
        System.out.println("Age of first student is "+obj.getAge());
        System.out.println("Name of second student is "+obj1.getName());
        System.out.println("Age of second student is "+obj1.getAge());
        

    }
}