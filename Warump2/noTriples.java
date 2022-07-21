package CodingBat.Warump2;

public class noTriples {
    public static void main(String[] args) {
        int[] arrayT = new int[]{1,2,3,4,4,4,5,6};
        System.out.println(noTriples(arrayT));
    }

    public static boolean noTriples(int[] nums) {
        if (nums.length>=3)
            for(int i=0; i<nums.length-2;i++)
                if(nums[i]==nums[i+1]&&nums[i+1]==nums[i+2]) return false;

        return true;
    }

}
