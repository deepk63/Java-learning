package homework.exercise7;

public class HeroMain {
    public static void main(String[] args) {
        var hero = new Hero();

        hero.name = "Soldier";
        hero.health = 100;
        hero.takeDamage(30);
    }
}
