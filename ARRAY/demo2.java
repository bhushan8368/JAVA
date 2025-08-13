public class demo2 {
    public static void main(String[] args) {
        //2D array
        int[][] arr=new int[3][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[2][0]=5;
        arr[2][1]=6;

        int nums[][]={
            {1,2},
            {2,5},
            {5,4}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                 System.out.print(nums[i][j]);
            }
        System.out.println();
        }

        System.out.println("---------------------");



        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                 System.out.print(arr[i][j]);
            }
        System.out.println();
        }

        //jagged arrays
        int [][] array={
            {1,2,3},
            {4,5,6},
            {7,8}
        };
        System.out.println("---------------------");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
        System.out.println("---------");
    
        





    

    }
    
}

