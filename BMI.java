import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your weight: ");
    double weight = input.nextDouble();
    
    System.out.println("Enter Your height: ");
    double height = input.nextDouble();   
    
    double bmi = weight / (height * height);

      if (bmi >= 25) {
      System.out.println("Your bmi is in the overweight zone");
    }
    else {
      System.out.println("Your bmi not in the overweight zone");
  
    }
    System.out.println("Your bmi is:");
    System.out.println(bmi);
  }
}