package CodingBat.Logic2;

public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3,2,11));
    }



    public static boolean makeBricks(int small, int big, int goal) {
        int answer = goal;
        for(int i=0; i<big;i++) {
            answer -=5;
            if(answer<=0) break;
        }
        if(answer==0) return true;
        if(answer<0){answer+=5;}
        if((answer-small)<=0) return true;

        return false;
    }

}
