 class test{

    String name="bhushan"; //instance variable
    int age=20;   //instance variable
    public static void main(String[] args) {
        //declare the variable
        // create the object
        test obj1=new test(); //reference   
        test obj2=new test();
        int num=0; //primitive  
        System.out.println(num);
        
        obj1.name="navin";

        System.out.println(obj1.name);  
        System.out.println(obj1.age);

        System.out.println(obj2.name);
        System.out.println(obj2.age);



        //NOTE
        //instance variables at the time of object creation 
        // stored in  heap as the part of obj
        //declared within the class directly but outside any method or block

        //LOCAL VARIABLES
        //STORED INSIDE THE STACK
        //declared within a method or block


        



    }
}