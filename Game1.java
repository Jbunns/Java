import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.*;


public class Game1
{
    public static void main(String[] args)
    {
        Board theBoard = new Board();
        theBoard.setPreferredSize(new Dimension(500,500)); 
    	theBoard.setLocation(500, 250);
        theBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theBoard.pack(); //sizing
        
        theBoard.setVisible(true);
    }   
}