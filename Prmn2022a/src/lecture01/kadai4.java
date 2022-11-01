package lecture01;

public class kadai4 {
    public static void main(String[] args) {
        int age = 23;
        if (age < 20) {
            System.out.println("I am " + age + "years old so I cannot drink liquor.");
            int[] array = new int[100];
            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }
            System.out.println("I am " + age + "years old so I can drink liquor.");

            int sum = 0;
            for (int j = 0; j < 100; j = j + 2) {
                sum = sum + array[j];
            }
            System.out.println(sum);
        }
    }
}
