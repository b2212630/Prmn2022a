package lecture04;

public class Fighter {
    private int hitPoint;
    private  int power;
    private  String name;

    public Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        int damage = enemy.getHitPoint()-power;
        enemy.hitPoint = enemy.hitPoint-power;
        System.out.println(power+"ダメージ与えた");
    }

    public boolean isAlive(){
        if(hitPoint > 0){
            return false;
        }else {
            return true;
        }
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint){
        if(hitPoint > 0){
            this.hitPoint = hitPoint;
        }else{
            System.out.println("もう一度やり直してください");
        }
    }

    public String getName(){
        return this.name;
    }



}
