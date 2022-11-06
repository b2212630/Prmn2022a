package lecture03;

import java.util.Scanner;
import  java.util.ArrayList;
public class kadai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> sentence = new ArrayList<>();
        String s;

        System.out.println("何行分入力しますか？");
        System.out.print(">");
        int n = scanner.nextInt();

        for(int i = 0;i<n;i++){
            System.out.println(i+1+"行目:");
            System.out.print(">");
            s = scanner.nextLine();
             sentence.add(new String(s));
        }

        System.out.println("入力した文字列:");
        for(int j = 0;j<n;j++){
            s = sentence.get(j);
            System.out.println("["+j+"] "+s);
        }

    }
}
