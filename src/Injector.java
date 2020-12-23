import ActionArena.PlayingField;
import ActionArena.World;
import Entity.Plant;
import UI.Actions.*;
import UI.CreateSpeciesWindow;
import UI.MainWindow;

import java.util.ArrayList;

public class Injector{
    int PLANTSN = 20;
    World world = World.createWorld(true);
    PlayingField playingField;


    MainWindow mainWindow;
    CreateSpeciesWindow createSpeciesWindow;

    ArrayList<Action> mWinAct;
    CreateAnimalAction createAnimalAction;
    CreateSpeciesWindowAction createSpeciesWindowAction;
    CreateSpeciesAction createSpeciesAction;
    KillAnimalAction killAnimalAction;
    MoveAnimalAction moveAnimalAction;

    public Injector(){

        mWinAct =new ArrayList<>();
        createAnimalAction = new CreateAnimalAction();
        createSpeciesAction = new CreateSpeciesAction();
        killAnimalAction = new KillAnimalAction();
        moveAnimalAction = new MoveAnimalAction(world);

        createSpeciesWindow = new CreateSpeciesWindow(createSpeciesAction);
        createSpeciesWindowAction = new CreateSpeciesWindowAction(createSpeciesWindow);
        mWinAct.add(createSpeciesWindowAction);
        mWinAct.add(createAnimalAction);
        mWinAct.add(moveAnimalAction);
        mWinAct.add(killAnimalAction);

        mainWindow = new MainWindow(600,500,mWinAct);

        mainWindow.setVisible(true);
    }
}
