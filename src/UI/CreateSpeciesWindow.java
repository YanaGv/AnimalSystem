package UI;

import UI.Actions.Action;
import UI.Actions.CreateSpeciesAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateSpeciesWindow extends JFrame {
    JButton button;
    Action action;

    public void execute(){}
    public CreateSpeciesWindow(UI.Actions.Action ac){
        action = new CreateSpeciesAction();
        action = ac;
        button = new JButton("Создать");
        setSize(100,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.execute();
            }
        });
        button.setPreferredSize(new Dimension(100,30));
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        getContentPane().add(button);
    }
}