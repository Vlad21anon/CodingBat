package CodingBat.Logic2;

public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(10,5,30));
    }


    public static int makeChocolate(int small, int big, int goal) {
        int answer = goal;
        for(int i =1; i<=big; i++){
            answer-=5;
            if (answer<=0) break;
        }
        if (answer == 0) return 0;
        if (answer < 0) answer +=5;
        for(int i=1;i<=small;i++){
            answer -=1;
            if (answer==0) return i;
        }
        return -1;
    }
}
