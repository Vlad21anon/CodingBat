package CodingBat.Logic2;

public class noTeenSum {
    public static void main(String[] args) {
        System.out.println(noTeenSum(1,2,7));
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    public static int fixTeen(int n){
        if (n==15 || n==16) return n;
        if (n>=13 && n<=19) return 0;
        return n;
    }
}
