package CodingBat.Logic1;

public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(5,5,true));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles)
            if (die2==die1) return (die1*2)<12?(die1*2+1):7;
        return die1+die2;
    }
}
