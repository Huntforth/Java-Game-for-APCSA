import java.util.Scanner;
import java.lang.Math;

class game 
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    int c = 0;
   
    while (flag) {
      System.out.println("Guess? (0 or 1)");
      
      int answer = scanner.nextInt();
      int comp = (int) (Math.random() * 2) / 1;
     
      if (answer == 0 || answer == 1)
      {
        if (answer == comp)
        {
          c++;
          System.out.println("Points: " + c);
        }
        else
        {
          flag = false;
        }
      }
    }
    System.out.println("GAME OVER/nPoints: " + c);
  } 
}
