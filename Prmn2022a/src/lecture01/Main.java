package lecture01;

public class Main {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        calculation calc = new calculation();
        int minm = calc.min(score);
        int maxi = calc.max(score);
        double ave = calc.average(score);


        for (int i = 0; i < score.length; i++) {
            if (score[i]<60){
                System.out.println(i +"番 " +score[i]+"点 "+"不可");
            } else if (score[i]<70) {
                System.out.println(i +"番 " +score[i]+"点 "+"可");
            } else if (score[i]<80) {
                System.out.println(i +"番 " +score[i]+"点 "+"良");
            } else if (score[i]<90) {
                System.out.println(i +"番 " +score[i]+"点 "+"優");
            }
            else {
                System.out.println(i +"番 " +score[i]+"点 "+"秀");
            }
        }
        System.out.println("最高点 "+maxi);
        System.out.println("最低点 "+minm);
        System.out.println("平均点 "+ave);
    }
}
