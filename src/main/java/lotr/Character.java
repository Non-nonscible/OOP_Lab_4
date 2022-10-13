package lotr;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    protected int hp;
    protected int power;

    public Character(){

    }
    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }

    public int getHp(){
        return hp;
    }

    public void setPower(int power) { this.power = power; }

    public int getPower(){
        return power;
    }

    public void kick(Character C){
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                "}";
    }

}
