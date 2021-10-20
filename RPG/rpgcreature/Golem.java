package rpgcreature;

import java.util.Random;

public class Golem extends Monster{
    private final static int CRITICAL_RATE = 5;
    private final static int CRITICAL_DAMAGE = 30;

    //ゴーレムのコンストラクタ
    public Golem(){
        super("ゴーレム",100);
    }
    
    //攻撃メソッド
    @Override
    public void attack(Creature opponent) {
        
        Random r=new Random();

        //クリティカル判定
        if(r.nextInt(100) < CRITICAL_RATE){
            System.out.printf("%sの攻撃！\n",getName());
            int damage = CRITICAL_DAMAGE;
            opponent.damaged(damage);

            displayMessage(opponent, damage);
        }else{
            
        }
    }
}
