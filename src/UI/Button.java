package UI;

import UI.Actions.Action;

import javax.swing.JButton;

public class Button extends JButton {
    Action action;

    public Button(Action a){
        action = a;
    }

    public Action getButtonAction() {
        return action;
    }
}
