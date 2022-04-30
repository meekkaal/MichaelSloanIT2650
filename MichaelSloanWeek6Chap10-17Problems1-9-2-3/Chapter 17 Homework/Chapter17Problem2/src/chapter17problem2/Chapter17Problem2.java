/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 17 - Problem 2
 * Purpose of Assignment: Create a tic-tac-toe game using Swing.
 */
package chapter17problem2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Michael Sloan
 */
public class Chapter17Problem2 extends JFrame implements ActionListener
{

  JButton[] buttons = new JButton[9];
  JButton newGame = new JButton("New Game");
  JLabel messages = new JLabel("X's Turn");

  int[][] winningCombinations = new int[][]
  {
    {
      0, 1, 2
    },
    {
      3, 4, 5
    },
    {
      6, 7, 8
    },
    {
      0, 3, 6
    },
    {
      1, 4, 7
    },
    {
      2, 5, 8
    },
    {
      0, 4, 8
    },
    {
      2, 4, 6
    }
  };

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 17, Problem 2");
    System.out.println("_________________________________");
    System.out.println("");

    Chapter17Problem2 gui = new Chapter17Problem2();
    gui.setVisible(true);
  }

  public Chapter17Problem2()
  {
    setSize(500, 300);
    setLayout(new BorderLayout());
    setTitle("Tic-Tac-Toe");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel topPanel = new JPanel();
    topPanel.setBackground(Color.LIGHT_GRAY);
    topPanel.setLayout(new BorderLayout());
    add(topPanel, BorderLayout.NORTH);

    topPanel.add(messages, BorderLayout.WEST);

    newGame.addActionListener(this);
    topPanel.add(newGame, BorderLayout.EAST);

    JPanel gamePanel = new JPanel();
    gamePanel.setLayout(new GridLayout(3, 3, 5, 5));
    gamePanel.setBackground(Color.BLACK);
    add(gamePanel, BorderLayout.CENTER);

    for (int i = 0; i < buttons.length; i++)
    {
      buttons[i] = new JButton();
      buttons[i].addActionListener(this);
      buttons[i].setBackground(Color.WHITE);
      buttons[i].setFont(new Font("Arial", Font.BOLD, 40));

      gamePanel.add(buttons[i]);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    boolean gameOver = false;
    if (e.getSource() != newGame)
    {
      if (!((JButton) e.getSource()).getText().isBlank())
      {
        JOptionPane.showMessageDialog(null, "This button was already selected, please try another.");
        return;
      }

      if (messages.getText().equals("X's Turn"))
      {
        ((JButton) e.getSource()).setText("X");
        messages.setText("O's Turn");
      } else if (messages.getText().equals("O's Turn"))
      {
        ((JButton) e.getSource()).setText("O");
        messages.setText("X's Turn");
      }

      for (int[] combo : winningCombinations)
      {
        int winCounterX = 0;
        int winCounterO = 0;
        for (int index : combo)
        {
          if (buttons[index].getText().equals("X"))
          {
            winCounterX++;
          } else if (buttons[index].getText().equals("O"))
          {
            winCounterO++;
          }
        }
        if (winCounterX == 3 || winCounterO == 3)
        {
          gameOver = true;
          for (int index : combo)
          {
            buttons[index].setBackground(Color.GREEN);
          }
          if (winCounterX == 3)
          {
            messages.setText("X Wins!");
          } else
          {
            messages.setText("O Wins!");
          }
        }
      }

      int selectedButtonCounter = 0;
      for (JButton button : buttons)
      {
        if (!button.getText().equals(""))
        {
          selectedButtonCounter++;
        }
      }
      if (selectedButtonCounter >= buttons.length && gameOver == false)
      {
        messages.setText("The game ended in a tie!");
      }
    } else
    {
      messages.setText("X's Turn");
      for (JButton button : buttons)
      {
        button.setText("");
        button.setBackground(Color.WHITE);
      }
    }
  }
}
