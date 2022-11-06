package lecture03;

import java.util.Scanner;
import  java.util.ArrayList;
public class kadai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> sentence = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        System.out.print(">");
        int n = scanner.nextInt();
        String s = scanner.nextLine();

        for(int i = 0;i<n;i++){
            System.out.println(i+1+"行目:");
            System.out.print(">");
            sentence.add(scanner.nextLine());
        }

        System.out.println("入力した文字列:");
        int i = 0;
        for(String list : sentence){
            System.out.println("["+i+"] "+list);
            i = i+1;
        }

    }
}
