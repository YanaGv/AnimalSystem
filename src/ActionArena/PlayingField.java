package ActionArena;

import Entity.LivingBeing;
import UI.IScrim;

public class PlayingField {
    int width;
    int height;
    IScrim scrim;
    World world;

    PlayingField(int w, int h, IScrim s, World world){
        width = w;
        height = h;
        scrim = s;
        this.world = world;
    }
    void draw(LivingBeing entity){
        scrim.draw(entity);
    }

}
