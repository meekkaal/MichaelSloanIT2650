/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 18 - Problem 7
 * Purpose of Assignment: Use Swing + MouseListener to create an application that marks and logs where a user clicks.
 */
package chapter18problem7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Michael Sloan
 */
public class Chapter18Problem7
{
  

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 18, Problem 7");
    System.out.println("_________________________________");
    System.out.println("");

    MouseDemo gui = new MouseDemo();
    gui.setVisible(true);
  }
}

class MouseDemo extends JFrame implements MouseListener
{
  private List<Point> points = new ArrayList<>();

  public void mouseClicked(MouseEvent e)
  {
    points.add(e.getPoint());
    System.out.println(e.getX() + " " + e.getY());
    repaint();
  }

  @Override
  public void mouseEntered(MouseEvent e)
  {
  }

  @Override
  public void mousePressed(MouseEvent e)
  {
  }

  @Override
  public void mouseReleased(MouseEvent e)
  {
  }

  @Override
  public void mouseExited(MouseEvent e)
  {
  }
  
  @Override
  public void paint(Graphics g)
  {
    super.paint(g);
    g.setColor(Color.BLUE);
    for (Point point : points)
    {
      // center the drawn circle over the mouse click
      g.fillOval(point.x - 8, point.y - 8, 16, 16);
    }
  }

  public MouseDemo()
  {
    super();
    setSize(600, 400);
    setTitle("Mouse Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addMouseListener(this);
  }
}
