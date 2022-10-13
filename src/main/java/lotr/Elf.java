package lotr;

public class Elf extends Character{

    public Elf(int hp, int power){
        super(hp, power);
        setHp(10);
        setPower(10);
    }

    public Elf() {
        setHp(10);
        setPower(10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        }
        else {
            c.setPower(c.getPower()-1);
        }
    }
}
