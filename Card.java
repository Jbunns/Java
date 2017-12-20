import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.*; 


@SuppressWarnings("serial") //strong-arm compiler
public class Card extends JButton
{
    private ImageIcon id;
    private boolean matched = false;


    public void setId(ImageIcon id)
    {
        this.id = id;
    }

    public ImageIcon getId()
    {
        return this.id;
    }


    public void setMatched(boolean matched)
    {
        this.matched = matched;
    }

    public boolean getMatched()
    {
        return this.matched;
    }
}