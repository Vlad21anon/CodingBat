package CodingBat.Warump2;

public class array667 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,6,6,6,7,6,10};
        System.out.println(array667(nums));
    }
    public static int array667(int[] nums) {
        int counter = 0;
        if (nums.length>1){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==6&&nums[i+1]==6||nums[i]==6&&nums[i+1]==7) counter++;
            }
        }
        return counter;
    }
}
