package CodingBat.Warump2;

public class arrayFont9 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,9};
        System.out.println(arrayFront9(nums));
    }
    public static boolean arrayFront9(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i<4){
                if (nums[i]==9) return true;
            }else return false;
        }
        return false;
    }
}
