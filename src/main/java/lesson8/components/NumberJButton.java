package lesson8.components;

import javax.swing.*;
import java.awt.*;

public class NumberJButton extends JButton {


    public NumberJButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 25));
        setBackground(new Color(123, 227, 206));
    }
}
