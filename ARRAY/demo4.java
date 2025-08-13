
    class calc{
        public int add(int nums[]) 
        {
            int result= 0;
            for(int n:nums){
                result += n;
                
            }
            return result;
        }
        
    }
    public class demo4 {
    public static void main(String[] args) {
        calc c = new calc();
        int result=c.add(new int[]{5,3,7});
        System.out.println("Result is: "+result);
    }
    
}
