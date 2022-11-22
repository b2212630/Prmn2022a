package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Locust locust = new Locust();
        SwallowtailButterfly sb = new SwallowtailButterfly();

        Insect[] mushi = {insect, butterfly, locust, sb};
        mushi[0].move();
        mushi[1].move();
        mushi[2].move();
        mushi[3].move();
    }
}
