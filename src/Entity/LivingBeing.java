package Entity;

public abstract class LivingBeing {
    int reproduction;
    int latitude;
    int longitude;

    public abstract LivingBeing reproduce(LivingBeing another);
    public abstract void die();

}
