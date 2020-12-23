package Entity;

import java.util.Random;
import java.util.stream.IntStream;

public class Plant extends LivingBeing{
    int nutritionalValue;
    boolean isPoisonous;

    public Plant(){
        Random random = new Random();
        nutritionalValue = random.nextInt(20)+1;
        isPoisonous = random.nextBoolean();
    }
    @Override
    public LivingBeing reproduce(LivingBeing another) {
        return null;
    }

    @Override
    public void die() {

    }
}
