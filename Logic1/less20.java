package CodingBat.Logic1;

public class less20 {
    public static void main(String[] args) {
        System.out.println(less20(999918));
    }

    public static boolean less20(int n) {
        if (n%20==18||n%20==19) return true;
        return false;
    }

}
