package CodingBat.Logic2;

public class loneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(1,2,3));
    }

    public static int loneSum(int a, int b, int c) {
        if (a==b && b==c) return 0;
        if (a==b ) return c;
        if (b==c) return a;
        if (a==c) return b;
        return a+b+c;
    }
}
