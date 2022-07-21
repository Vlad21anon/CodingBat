package CodingBat.Logic1;

public class alarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(6,true));
    }

    public static String alarmClock(int day, boolean vacation) {
        return vacation?(day==0||day==6?"off":"10:00"):(day==0||day==6?"10:00":"7:00");
    }
}
