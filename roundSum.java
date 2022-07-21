package CodingBat.Logic2;

public class roundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(199,99,9));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public static int round10(int num){
        if(num%10>=5) return num - num%10 + 10;
        return num- num%10;
    }
}
