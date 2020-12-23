package ActionArena;

import Entity.*;

import java.util.ArrayList;

public class World {
    static boolean isGamer;
    static World world = null;

    ArrayList<Predator> loners = null;
    ArrayList<Plant> plants = null;
    ArrayList<Flock> flocks = null;
    ArrayList<AnimalSpecies> species = null;
    PlayingField field;

    public static World createWorld(boolean isG){
        if(world == null){
            world = new World();
            isGamer = isG;
        }
        return world;
    }
    private World( ){

    }
    public ArrayList<Predator> getLoners(){return loners;}
    public ArrayList<Plant> getPlants(){return plants;}
    public ArrayList<Flock> getFlocks(){return flocks;}
}
