package homework.exercise7;

public class Hero {
    String name;
    int health;

    void takeDamage(int damage){
        int newHealth = health - damage;
        System.out.println(name + " has " + newHealth + " left.");
    }
}

