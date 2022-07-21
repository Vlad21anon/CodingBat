package CodingBat.Logic1;

public class greenTicket {
    public static void main(String[] args) {
        System.out.println(greenTicket(10,15,20));
    }

    public static int greenTicket(int a, int b, int c) {
        return a==b?(b==c?20:10):(a==c?10:(b==c?10:0));
    }
}
