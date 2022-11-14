package lecture04;

public class Kadai1 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(100, 30, "自分");
        Fighter f2 = new Fighter(100, 40, "敵");

        while(true) {

                System.out.print(f1.getName()+"は"+f2.getName()+"に");
                f1.attack(f2);
                System.out.println(f2.getName()+"の残りHP : " + f2.getHitPoint());
                if(f2.isAlive()) {
                System.out.println(f2.getName()+"は倒れた。");
                break;
                }


                System.out.print(f2.getName()+"は"+f1.getName()+"に");
                f2.attack(f1);
                System.out.println(f1.getName()+"の残りHP : " + f1.getHitPoint());
                if (f1.isAlive()) {
                System.out.println(f1.getName()+"は倒れた。");
                break;
                }

        }
    }
}


