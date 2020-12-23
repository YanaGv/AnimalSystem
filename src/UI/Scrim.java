package UI;

import Entity.LivingBeing;

import javax.swing.*;
import java.awt.*;

public class Scrim extends JPanel implements IScrim {

    @Override
    public void draw(LivingBeing entity) { }
    public Scrim(){
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(605,400));
    }
}
