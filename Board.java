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
public class Board extends JFrame
{


    private List<Card> cards;
    private Card selectedCard;
    private Card c1; // selections
    private Card c2;
    private Timer t;

    public Board()
    {

        int pairs = 8;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();

        for (int i = 0; i < pairs; i++)
        {
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);
        
        ImageIcon stl = new ImageIcon("cards.jpg");
        ImageIcon chicago = new ImageIcon("cubs.jpg");
        ImageIcon miami = new ImageIcon("marlins.jpg");
        ImageIcon atl = new ImageIcon("braves.jpg");
        ImageIcon milw = new ImageIcon("brewers.jpg");
        ImageIcon cincy = new ImageIcon("reds.jpg");
        ImageIcon colo = new ImageIcon("rockies.jpg");
        ImageIcon washington = new ImageIcon("nationals.jpg");
        

        for (int val : cardVals)
        {
            Card c = new Card();
            c.setId(val);
            c.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    selectedCard = c;
                    flip();
                }
       		});
            cardsList.add(c);
        }
        this.cards = cardsList;
        timer = new Timer(750, new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                checkCards();
            }
        });

        timer.setRepeats(false);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 4));
        pane.setBackground(Color.black);
        for (Card c : cards) // for each
        {
            pane.add(c);
        }
        setTitle("Baseball Memory Match");
    }

    public void flip()
    {
        if (c1 == null && c2 == null)
        {
            c1 = selectedCard;
            c1.setText(String.valueOf(c1.getId())); // change this to image icon
        }

        if (c1 != null && c1 != selectedCard && c2 == null){
            c2 = selectedCard;
            c2.setText(String.valueOf(c2.getId())); // change this to image icon
            timer.start();

        }
    }

    public void checkCards()
    {
        if (c1.getId() == c2.getId()) // need to change this to image icon comparison
        {//match condition
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setMatched(true); //flags the button as having been matched
            c2.setMatched(true);
            if (this.gameOver())
            {
                JOptionPane.showMessageDialog(this, "You won!");
                System.exit(0);
            }
        }

        else
        {
            c1.setText(""); //'hides' text
            c2.setText("");
        }
        c1 = null; //reset c1 and c2
        c2 = null;
    }

    public boolean gameOver()
    {
        for(Card c: this.cards)
        {
            if (c.getMatched() == false)
            {
                return false;
            }
        }
        return true;
    }

}