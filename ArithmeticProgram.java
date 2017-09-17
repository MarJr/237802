import java.io.*;
import java.util.*;
/*This class is created to manipulate arithmetic operations*/
public class ArithmeticProgram {
  static final int NUMBER = 12;
  static Scanner in = new Scanner (System.in);
  public static void main(String[] args) throws IOException {
     int firstNum, secondNum;
     firstNum=18;
     System.out.println("Enter an integer:");
     secondNum = in.nextInt();
     System.out.println("Value of firstNum:"+firstNum);
     System.out.println("Value of secondNum:"+secondNum);
     firstNum=firstNum+NUMBER+2*secondNum;
     System.out.println("New value of firstNum:"+firstNum);
 }
}
