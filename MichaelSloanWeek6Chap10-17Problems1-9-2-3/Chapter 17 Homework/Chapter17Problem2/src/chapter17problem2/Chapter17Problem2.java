/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 17 - Problem 2
 * Purpose of Assignment:
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
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Michael Sloan
 */
public class Chapter17Problem2 extends JFrame
{

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
    setSize(500,300);
    setLayout(new BorderLayout());
    setTitle("Tic-Tac-Toe");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel topPanel = new JPanel();
    topPanel.setBackground(Color.LIGHT_GRAY);
    topPanel.setLayout(new BorderLayout());

    add(topPanel, BorderLayout.NORTH);
    
    JLabel messages = new JLabel("X's Turn");
    topPanel.add(messages, BorderLayout.WEST);
    
    JButton newGame = new JButton("New Game");
    topPanel.add(newGame, BorderLayout.EAST);
    
    JPanel gamePanel = new JPanel();
    gamePanel.setLayout(new GridLayout(3,3,5,5) );
    gamePanel.setBackground(Color.BLACK);
    add(gamePanel, BorderLayout.CENTER);
    
    JButton button0 = new JButton();
    gamePanel.add(button0);
    JButton button1 = new JButton();
    gamePanel.add(button1);
    JButton button2 = new JButton();
    gamePanel.add(button2);
    JButton button3 = new JButton();
    gamePanel.add(button3);
    JButton button4 = new JButton();
    gamePanel.add(button4);
    JButton button5 = new JButton();
    gamePanel.add(button5);
    JButton button6 = new JButton();
    gamePanel.add(button6);
    JButton button7 = new JButton();
    gamePanel.add(button7);
    JButton button8 = new JButton();
    gamePanel.add(button8);
  }
}
