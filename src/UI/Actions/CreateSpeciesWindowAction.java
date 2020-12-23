package UI.Actions;

import UI.CreateSpeciesWindow;

public class CreateSpeciesWindowAction implements Action {
    CreateSpeciesWindow window;
    public CreateSpeciesWindowAction(CreateSpeciesWindow win){
        window = win;
    }

    @Override
    public void execute() {
        window.setVisible(true);
    }
}
