package chapter4problem6;

import java.text.DecimalFormat;

/**
 *
 * @author Michael Sloan
 */
public class StudentRecord
{
  DecimalFormat scoreFormat = new DecimalFormat("0.#");

  private double quizScore1;
  private double quizScore2;
  private double quizScore3;
  private double midtermScore;
  private double finalScore;

  private double overallScore;

  private String finalLetterGrade;
  
  public String getScores()
  {
    return "Quiz 1: " + scoreFormat.format(quizScore1) 
           + ", Quiz 2: " + scoreFormat.format(quizScore2)
           + ", Quiz 3: " + scoreFormat.format(quizScore3)
           + ", Midterm: " + scoreFormat.format(midtermScore)
           + ", Final: " + scoreFormat.format(finalScore);
  }
  public double getTotalScore()
  {
    return overallScore;
  }
  public String getLetterGrade()
  {
    return finalLetterGrade;
  }

  public boolean setQuizScores(int quizScore1, int quizScore2, int quizScore3)
  {
    if (quizScore1 > 10 || quizScore2 > 10 || quizScore3 > 10)
    {
      return false;
    } else
    {
      this.quizScore1 = quizScore1;
      this.quizScore2 = quizScore2;
      this.quizScore3 = quizScore3;
      return true;
    }
  }

  public boolean setTestScores(int midtermScore, int finalScore)
  {
    if (midtermScore > 100 || finalScore > 100)
    {
      return false;
    } else
    {
      this.midtermScore = midtermScore;
      this.finalScore = finalScore;
      return true;
    }
  }

  public void calculateNumericGrade()
  {
    double quizAverage = (quizScore1 + quizScore2 + quizScore3) / 30;
    double quizWeighted = quizAverage * .25;
    
    double midtermAverage = midtermScore / 100;
    double midTermWeighted = midtermAverage * .35;
    
    double finalAverage = finalScore / 100;
    double finalWeighted = finalAverage * .40;
    
    overallScore = (quizWeighted + midTermWeighted + finalWeighted) * 100;
  }

  public void calculateLetterGrade()
  {
    if (overallScore >= 90)
    {
      finalLetterGrade = "A";
    }
    else if (overallScore >= 80)
    {
      finalLetterGrade = "B";
    }
    else if (overallScore >= 70)
    {
      finalLetterGrade = "C";
    }
    else if (overallScore >= 60)
    {
      finalLetterGrade = "D";
    }
    else
    {
      finalLetterGrade = "F";
    }
  }

  @Override
  public String toString()
  {
    return "Quiz 1: " + ", Quiz 2: " + ", Quiz 3: " + ", Midterm: " + ", Final: ";
  }

  public boolean equals(StudentRecord record)
  {
    return true;
  }

}
