import java.util.Scanner;
import java.lang.Math;

class main 
{
  Scanner scanner = new Scanner(System.in);
  boolean flag = true;
  
  System.out.println("Guess 1 or 0");
  while (flag)
  {
    System.out.println("Guess?");
    int answer = scanner.nextInt();
    int comp = (Math.random * 2) / 1;
    System.out.println(comp);
    if (answer != comp)
      flag = false;
  }
}
