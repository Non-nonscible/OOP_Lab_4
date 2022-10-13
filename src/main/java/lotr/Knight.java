package lotr;

import java.util.Random;

public class Knight extends Character{
    Random rand = new Random();
    protected int min_hp = 2;
    protected int min_power = 2;
    protected int num = 10;
    public Knight() {
        this.hp = (int) (Math.random() * (this.num +1 + this.min_hp));
        this.power = this.min_power;
    }

    @Override
    public void kick(Character c){
        this.power = (int) (Math.random() * (this.num +1 + this.min_power));
        c.setHp(c.getHp() - rand.nextInt(this.getPower()));
    }
}
