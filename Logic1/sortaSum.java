package CodingBat.Logic1;

public class sortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(20,-5));
    }

    public static int sortaSum(int a, int b) {
        if(a+b>=10 && a+b<=19) return 20;
        return a+b;
    }

}
