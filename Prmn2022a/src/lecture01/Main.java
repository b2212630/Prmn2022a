package lecture01;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0;i<100;i++){
            array[i] = i+1;
        }

        int sum = 0;
        for(int j=0;j<100;j=j+2){
            sum = sum + array[j];
        }
        System.out.println(sum);
    }
}
