public class demo3 {
    public static void main(String[] args) 
    {
        String name="bhushan";
        System.out.println(name.length());
        int[] arr={1,2,3};
        //length of an array
        System.out.println("Length of array is: "+arr.length);
        for(int n:arr){
            System.out.println(n);
        }
        int [][] array={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //length of 2D array
        System.out.println("Length of 2D array is: "+array.length);
        for(int a[]:array){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();

        }

    }
    
}
