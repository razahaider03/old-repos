package Logic;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String argumentOne = sc.nextLine();
    int argOne = Integer.parseInt(argumentOne);
    System.out.println("you input " + argOne);
    String argumentTwo = sc.nextLine();
    int argTwo = Integer.parseInt(argumentTwo);
    System.out.println("you input " + argTwo);
    String operation = sc.nextLine();
    int operations = Integer.parseInt(operation);
    System.out.println("Adding......");
    Logic obj = new Logic();
    obj.process(argOne, argTwo, operations);
  }
}
