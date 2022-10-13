package lotr;
import lotr.CharacterFactory;
public class GameManager {
    public static void fight(Character c1, Character c2){
        System.out.println("The battle will begin");
        System.out.println("Warrior 1:" + c1.toString());
        System.out.println("Warrior 2:" + c2.toString());
        int turn = 0;

        while (c1.isAlive() && c2.isAlive() && turn < 500){
            if (turn % 2 == 0){
                c1.kick(c2);
                System.out.println("Warrior 1 " + c1.getClass().getSimpleName() + " kicks " + "Warrior 2 " + c2.getClass().getSimpleName());
                System.out.println("Warrior 2 " + c2.getClass().getSimpleName() + " now has " + c2.hp + " HP left");
            }
            else {
                c2.kick(c1);
                System.out.println("Warrior 2 " + c2.getClass().getSimpleName() + " kicks " + "Warrior 1 " + c1.getClass().getSimpleName());
                System.out.println("Warrior 1 " + c1.getClass().getSimpleName() + " now has " + c1.hp + " HP left");
            }
            turn ++;
        }
        if (turn == 499){
            System.out.println("It's DRAW!!!");
            System.out.println("The battle is to long to continue");
        }
        if (turn % 2 == 1){
            System.out.println("Warrior 1 " +c1.getClass().getSimpleName() +" WINS!!!");
        }
        else {
            System.out.println("Warrior 2 "+c2.getClass().getSimpleName() +" WINS!!!");
        }
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}
