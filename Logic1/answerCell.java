package CodingBat.Logic1;

public class answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(true,true,true));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return isMorning?(isAsleep?false:(isMom?true:false)):(isAsleep?false:true);
    }
}
