package CodingBat.Logic1;

public class caughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(100,true));
    }


    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) return speed-5<=60?0:(speed-5<=80?1:(speed-5>80?2:-1));
        return speed<=60?0:(speed<=80?1:(speed>80?2:-1));
    }
}
