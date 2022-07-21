package CodingBat.Logic1;

public class sumLimit {
    public static void main(String[] args) {
        System.out.println(sumLimit(1,90));
    }
    public static int sumLimit(int a, int b) {
        boolean str1 = String.valueOf(a).length() < String.valueOf(a+b).length();
        if(str1){
            return a;
        }
        return a+b;

    }
}
