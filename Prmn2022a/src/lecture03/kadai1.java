package lecture03;

import java.util.Scanner;
public class kadai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("任意の文字列を入力してください:");
        System.out.println(">");
        String input = scanner.nextLine();
        System.out.println("”"+input+"”　と入力されました");

    }
}
