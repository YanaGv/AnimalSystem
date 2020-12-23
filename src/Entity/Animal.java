package Entity;

public class Animal extends LivingBeing {
    int hunger;
    int health;
    int age;
    int lineOfSight;
    int damage;

    void increaseHunger(int points){}
    public void move(){}
    public void eat(LivingBeing entity){}
    public void reduceHunger(int points){}
    public void increaseHit(int points){}
    public void reduceHit(int points){}

    @Override
    public LivingBeing reproduce(LivingBeing another) {
        return null;
    }

    @Override
    public void die() {

    }
}
