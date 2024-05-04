public class removeDuplicate {
    

    public static int removeDuplicates(int[] nums) {
                int n = nums.length;
                if(n == 0) return n;
        
        int i = 0;
        for (int j = 0; j <= n-1; j++) {
            if (nums[i] != nums[j]) {
                
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;  
    }

    public static void main(String[] args) {
        
        int[] arr= {0,1,2,3,0,3,4,0,0};

       int number= removeDuplicates(arr);

       System.out.println(number);
    }

}
