/*
 * IT-2650 Java Programming, Spring 2022
 * Instructor: Martin P. Walsh
 * Student Name: Michael Sloan
 * Homework Assignment: Chap 17 - Problem 3
 * Purpose of Assignment: Create a calculator using Swing.
 */
package chapter17problem3;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Michael Sloan
 */
public class Chapter17Problem3 extends JFrame implements ActionListener
{

  public static final int WIDTH = 400;
  public static final int HEIGHT = 400;
  public static final int NUMBER_OF_DIGITS = 34;

  private final JTextField resultField;
  private final JTextField operandField;
  private double result = 0.0;
  boolean buildingOperand = true;

  JButton[] buttons = new JButton[16];

  String operation = "";
  String[] symbols =
  {
    "7", "8", "9", "/", "4", "5", "6", "X", "1", "2", "3", "-", "0", ".", "=", "+"
  };

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    System.out.println("IT-2650 Java Programming");
    System.out.println("Student Name: Michael Sloan");
    System.out.println("Homework Assignment: Chapter 17, Problem 3");
    System.out.println("_________________________________");
    System.out.println("");

    NumberFormat formatter = new DecimalFormat();

    Chapter17Problem3 gui = new Chapter17Problem3();
    gui.setVisible(true);
  }

  public Chapter17Problem3()
  {
    setTitle("Calculator");
    getContentPane().setBackground(Color.lightGray);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(WIDTH, HEIGHT);
    setLayout(new BorderLayout());

    JPanel topPanel = new JPanel();
    topPanel.setBackground(Color.lightGray);
    topPanel.setLayout(new GridLayout(5, 1));

    JLabel resultLabel = new JLabel("Result");
    topPanel.add(resultLabel);
    resultField = new JTextField("0.0", NUMBER_OF_DIGITS);
    resultField.setEditable(false);
    resultField.setHorizontalAlignment(SwingConstants.RIGHT);
    topPanel.add(resultField);

    JLabel operandLabel = new JLabel("Operand");
    topPanel.add(operandLabel);
    operandField = new JTextField("", NUMBER_OF_DIGITS);
    operandField.setEditable(false);
    operandField.setHorizontalAlignment(SwingConstants.RIGHT);
    operandField.setBackground(Color.WHITE);
    topPanel.add(operandField);

    JPanel controlPanel = new JPanel();
    controlPanel.setBorder(new EmptyBorder(2, 5, 0, 5));
    controlPanel.setBackground(Color.lightGray);
    controlPanel.setLayout(new GridLayout(1, 2, 10, 0));
    JButton clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    clearButton.setBackground(Color.WHITE);
    controlPanel.add(clearButton);
    JButton resetButton = new JButton("Reset");
    resetButton.addActionListener(this);
    resetButton.setBackground(Color.WHITE);
    controlPanel.add(resetButton);
    topPanel.add(controlPanel);

    add(topPanel, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    buttonPanel.setBackground(Color.lightGray);
    buttonPanel.setLayout(new GridLayout(4, 4, 10, 5));
    for (int i = 0; i < symbols.length; i++)
    {
      buttons[i] = new JButton(symbols[i]);
      buttons[i].addActionListener(this);
      buttons[i].setBackground(Color.WHITE);

      buttonPanel.add(buttons[i]);
    }
    
    add(buttonPanel, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    String action = e.getActionCommand();
    double operandValue = stringToDouble(operandField.getText());

    switch (action)
    {
      case "Reset" ->
      {
        result = 0.0;
        operation = "";
        resultField.setText("0.0");
      }
      case "Clear" ->
      {
        operandField.setText("");
      }
      case "+" ->
      {
        operation = "+";
        buildingOperand = false;
      }
      case "-" ->
      {
        operation = "-";
        buildingOperand = false;
      }
      case "X" ->
      {
        operation = "X";
        buildingOperand = false;
      }
      case "/" ->
      {
        operation = "/";
        buildingOperand = false;
      }
      case "=" ->
      {
        if (operation.equals("+"))
        {
          result += operandValue;
        }
        if (operation.equals("-"))
        {
          result -= operandValue;
        }
        if (operation.equals("X"))
        {
          result *= operandValue;
        }
        if (operation.equals("/"))
        {
          try
          {
            if (operandValue == 0)
            {
              throw new DivisionByZeroException();
            }
            result /= operandValue;
          } catch (DivisionByZeroException zeroException)
          {
            operandField.setText(zeroException.getMessage());
            buildingOperand = false;
            break;
          }
        }
        resultField.setText(Double.toString(result));
        operandField.setText("");
        buildingOperand = false;
      }
      default ->
      {
        if (buildingOperand)
        {
          operandField.setText(operandField.getText() + action);
        } else
        {
          if (operandField.getText().isBlank() || operandField.getText().equals("Division by Zero"))
          {
            resultField.setText("0.0");
          } else
          {
            resultField.setText(operandField.getText());
          }
          operandField.setText(action);
          buildingOperand = true;
        }
      }
    }
    if (!buildingOperand)
    {
      result = operandValue;
    }

  }

  private static double stringToDouble(String value)
  {
    if (value.equals("Division by Zero"))
    {
      return 0;
    }
    return value == null || value.isEmpty() ? Double.NaN : Double.parseDouble(value);
  }
}
