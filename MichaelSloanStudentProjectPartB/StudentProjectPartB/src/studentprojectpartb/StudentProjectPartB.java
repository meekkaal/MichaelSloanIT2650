/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Student Project Part B
 * Purpose of Assignment: GUI Loop Comparison Application – Which Loop structure is the fastest?
 */
package studentprojectpartb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Michael Sloan
 */
public class StudentProjectPartB extends JFrame implements ActionListener
{

  JButton whileLoopBtn = new JButton("While Loop");
  JButton doWhileLoopBtn = new JButton("Do While Loop");
  JButton forLoopLoopBtn = new JButton("For Loop");
  JButton clearAllBtn = new JButton("Clear All");

  JLabel startTimeActual = new JLabel();
  JLabel endTimeActual = new JLabel();
  JLabel elapsedTimeActual = new JLabel();
  JLabel completedLoopsActual = new JLabel();

  JLabel doWhileElapsed = new JLabel();
  JLabel whileElapsed = new JLabel();
  JLabel forElapsed = new JLabel();
  
  DecimalFormat formatter = new DecimalFormat("0.0000");
  
  DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a")
            .withZone(ZoneId.systemDefault());

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Student Project Part B");
    System.out.println("_________________________________");
    System.out.println("");
    
    

    StudentProjectPartB gui = new StudentProjectPartB();
    gui.setVisible(true);
  }

  public StudentProjectPartB()
  {
    setTitle("Compare Loop Statements");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 500);
    setLayout(new GridLayout(7, 1));
    getRootPane().setBorder(new EmptyBorder(15, 20, 15, 20));

    JPanel startPanel = new JPanel();
    startPanel.setLayout(new GridLayout(1, 4));
    add(startPanel);
    JLabel startTimeLbl = new JLabel("Start Time");
    startPanel.add(startTimeLbl);
    startPanel.add(startTimeActual);
    startPanel.add(new JLabel());

    JPanel endPanel = new JPanel();
    endPanel.setLayout(new GridLayout(1, 3));
    add(endPanel);
    JLabel endTime = new JLabel("End Time");
    endPanel.add(endTime);
    endPanel.add(endTimeActual);
    endPanel.add(new JLabel());

    JPanel elapsedPanel = new JPanel();
    elapsedPanel.setLayout(new GridLayout(1, 3));
    add(elapsedPanel);
    JLabel elapsedTime = new JLabel("Elapsed Time");
    JLabel numberOfSeconds = new JLabel("number of seconds");
    numberOfSeconds.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
    elapsedPanel.add(elapsedTime);
    elapsedPanel.add(elapsedTimeActual);
    elapsedPanel.add(numberOfSeconds);

    JPanel completedPanel = new JPanel();
    completedPanel.setLayout(new GridLayout(1, 3));
    add(completedPanel);
    JLabel completedLoops = new JLabel("Completed Loops");  
    completedPanel.add(completedLoops);
    completedPanel.add(completedLoopsActual);
    completedPanel.add(new JLabel());

    JPanel loopButtonPanel = new JPanel();
    loopButtonPanel.setLayout(new GridLayout(1, 4, 10, 0));
    add(loopButtonPanel);

    whileLoopBtn.addActionListener(this);
    forLoopLoopBtn.addActionListener(this);
    doWhileLoopBtn.addActionListener(this);
    clearAllBtn.addActionListener(this);
    loopButtonPanel.add(whileLoopBtn);
    loopButtonPanel.add(forLoopLoopBtn);
    loopButtonPanel.add(doWhileLoopBtn);
    loopButtonPanel.add(clearAllBtn);

    JPanel totalElapsedPanel = new JPanel();
    totalElapsedPanel.setLayout(new GridLayout(1, 1));
    add(totalElapsedPanel);
    JLabel totalElapsedTime = new JLabel("Average Elapsed Time for 10 million Loops (in number of seconds)");
    totalElapsedTime.setFont(new Font("Verdana", Font.BOLD, 12));
    totalElapsedPanel.add(totalElapsedTime);

    JPanel elapsedLoopsPanel = new JPanel();
    add(elapsedLoopsPanel);
    elapsedLoopsPanel.setLayout(new GridLayout(1, 3));

    elapsedLoopsPanel.add(whileElapsed);
    elapsedLoopsPanel.add(forElapsed);
    elapsedLoopsPanel.add(doWhileElapsed);
  }

  @Override
  public void actionPerformed(ActionEvent event)
  {
    try
    {
      switch (event.getActionCommand())
      {
        case "While Loop" ->
          executeWhileLoops();
        case "Do While Loop" ->
          executeDoWhileLoops();
        case "For Loop" ->
          executeForLoops();
        case "Clear All" ->
          clearAll();
      }
    } catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, "An exception occured:" + e.getMessage());
    }
  }

  private void executeWhileLoops()
  {
    int intCounter = 1;
    int intLoops = 0;
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    long[] whileCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      startTimeActual.setText(timeFormatter.format(startTime));
      while (intCounter < 10000001)
      {
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);        
        intCounter++;
        intLoops++;
      }
      completedLoopsActual.setText(Integer.toString(intCounter - 1));
      Instant endTime = Instant.now();   
      whileCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + whileCounter[i];
      intCounter = 1;
    }
    Instant endTime = Instant.now();
    endTimeActual.setText(timeFormatter.format(endTime));
    String result = formatter.format((sum / whileCounter.length) / 1000.0);
    elapsedTimeActual.setText(result);
    whileElapsed.setText(result);
  }

  private void executeDoWhileLoops()
  {

    int intCounter = 1;
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    int intLoops = 0;

    long[] doWhileCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      startTimeActual.setText(timeFormatter.format(startTime));
      do
      {
        ++intCounter;
        ++intLoops;
        dblSquared = Math.pow(intCounter, 2);
        dblLog = Math.log10(intCounter);
      } while (intCounter <= 10000000);
      Instant endTime = Instant.now();
      doWhileCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + doWhileCounter[i];
      intCounter = 1;
    }
    Instant endTime = Instant.now();
    endTimeActual.setText(timeFormatter.format(endTime));

    String result = formatter.format((sum / doWhileCounter.length) / 1000.0);
    elapsedTimeActual.setText(result);
    doWhileElapsed.setText(result);
  }

  private void executeForLoops()
  {
    double dblSquared = 0.0;
    double dblLog = 0.0;
    double dblElapsedTime = 0.0;
    long sum = 0;
    int intLoops = 0;
    long[] forCounter = new long[10];

    for (int i = 0; i < 10; i++)
    {
      Instant startTime = Instant.now();
      startTimeActual.setText(timeFormatter.format(startTime));
      for (int intCounter = 1; intCounter <= 10000000; ++intCounter)
      {
        ++intLoops;
        dblSquared = Math.pow(intLoops, 2);
        dblLog = Math.log10(intLoops);
      }
      Instant endTime = Instant.now();
      forCounter[i] = Duration.between(startTime, endTime).toMillis();
      sum = sum + forCounter[i];
    }
    Instant endTime = Instant.now();
    endTimeActual.setText(timeFormatter.format(endTime));
    
    String result = formatter.format((sum / forCounter.length) / 1000.0);
    elapsedTimeActual.setText(result);
    forElapsed.setText(result);
  }

  private void clearAll()
  {
    startTimeActual.setText("");
    endTimeActual.setText("");
    elapsedTimeActual.setText("");
    completedLoopsActual.setText("");
    whileElapsed.setText("");
    doWhileElapsed.setText("");
    forElapsed.setText("");
   
  }

}
