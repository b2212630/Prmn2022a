package lecture03;

import java.util.Scanner;
public class kadai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[2];
        String s;

        for(int i = 0;i<a.length;i++){
            System.out.println(i+1+"つ目の整数を入力してください:");
            System.out.print(">");
            s = scanner.nextLine();
            a[i] = Integer.parseInt(s);
        }
        int sum = a[0]+a[1];
        System.out.println(a[0]+" + "+a[1]+" = "+sum);
    }
}
