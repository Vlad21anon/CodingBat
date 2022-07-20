package CodingBat.Warump2;

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
    }

    public static String frontTimes(String str, int n) {
        String answ = "";
        if (str.length()>=3){
            for(int i = 0; i<n; i++){
                answ += str.substring(0,3);
            }
        }else{
            for(int i = 0; i<n; i++){
                answ += str.substring(0,str.length());
            }
        }
        return answ;
    }
}
