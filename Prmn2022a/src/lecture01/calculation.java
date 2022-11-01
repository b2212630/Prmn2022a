package lecture01;

public class calculation {
    int min(int[] score){
       int x = score[0];
       for(int i=1;i<score.length;i++){
           if(x>score[i]){
               x = score[i];
           }
       }
       return x;
    }

    int max(int[] score){
        int x = score[0];
        for(int i=1;i<score.length;i++){
            if(x<score[i]){
                x = score[i];
            }
        }
        return x;
    }

    double average(int[] score){
        int sum = 0;
        double ave;
        for(int i=0;i<score.length;i++){
            sum = sum+score[i];
        }
        ave = (double) sum/(double) score.length;
        return ave;
    }
}
