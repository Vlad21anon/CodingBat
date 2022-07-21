package CodingBat.Logic2;

public class blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(20,30));
    }

    public static int blackjack(int a, int b) {
        if (a>21 && b>21) return 0;
        if (a<=21 && b>21) return a;
        if (b<=21 && a>21) return b;
        if(a>b) return a;
        if(a<b) return b;
        return 999;
    }
}
