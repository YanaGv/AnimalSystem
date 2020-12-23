package UI;

import UI.Actions.Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainWindow extends JFrame {
    Scrim scrim;
    ArrayList<Button> buttons ;
    ArrayList<Action> actions;
    void draw(){}


    public MainWindow(int w, int h, ArrayList<Action> e){
        ArrayList<Action> buttonActions = new ArrayList<>();
        buttons = new ArrayList<Button>();
        setSize(w, h);

        actions = e;
        scrim = new Scrim();

        setLayout(new FlowLayout(FlowLayout.LEFT));
        getContentPane().add(scrim);
        createInterface();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void createInterface(){
        for (Action a: actions){
            buttons.add(new Button(a));
        }
        for (Button b: buttons) {
            b.setSize(20, 20);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b.getButtonAction().execute();
                }
            });
            getContentPane().add(b);
        }
    }
}
