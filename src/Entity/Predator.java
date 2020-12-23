package Entity;

public class Predator extends Animal{
    boolean leader;
    Flock flock;

    public boolean isSeeTheLeader() {
        return false;
    }
    protected void attack(){}
    public boolean isSeeEnemy(){
        return false;
    }
    public void move(){}
    public void eat(LivingBeing entity){}
}
