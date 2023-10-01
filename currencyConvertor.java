import java.util.Scanner;
public class currencyConvertor{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        
      System.out.println("*********Welcome to Currency Convertor **********");

      System.out.println("Select the currency given below :");
      System.out.println("1) Dollars ");
      System.out.println("2) Rupees ");
      System.out.println("3) Yen ");
      System.out.println("4) Euros ");
      System.out.println("Enter your Choice : ");
      int choice = sc.nextInt();
      System.out.println("Enter your amount :");
      double amount =sc.nextDouble();

      switch(choice){
        case 1:
        dollars_to_others(amount);
        break;
        case 2:
        rupees_to_others(amount);
        break;
        case 3:
        yen_to_others(amount);
        break;
        case 4:
        euro_to_others(amount);
        break;

        default:
        System.out.println("Invalid Choice !");


      }
}

public static void dollars_to_others(double amount){

    System.out.println(" 1 dollars = 0.94 ");
    System.out.println(" 1 dollars = 83.04 rupees");
    System.out.println("1 dollars = 149.38 Yen");

    System.out.println();

    System.out.println(amount +" dollars "+" = " + (0.94*amount)+" euro" );
    System.out.println(amount +" dollars "+" = " + (83.04*amount)+" rupees" );
    System.out.println(amount +" dollars "+" = " + (149.38*amount)+" Yen" );

}

public static void rupees_to_others(double amount){


    System.out.println(" 1 rupees = 0.011 euro");
    System.out.println(" 1 rupees = 0.012 dollars");
    System.out.println(" 1 rupees = 1.80 Yen");

    System.out.println();

    System.out.println(amount +" rupees "+" = " + (0.011*amount)+" euro" );
    System.out.println(amount +" rupees "+" = " + (0.012*amount)+" dollars" );
    System.out.println(amount +" rupees "+" = " + (1.80*amount)+" Yen" );

}

public static void yen_to_others(double amount){


    System.out.println(" 1 Yen = 0.0063 euro");
    System.out.println(" 1 Yen = 0.0067 dollars");
    System.out.println(" 1 Yen = 0.56 rupees");

    System.out.println();

    System.out.println(amount +" Yen "+" = " + (0.0063*amount)+" euro" );
    System.out.println(amount +" Yen "+" = " + (0.0067*amount)+" dollars" );
    System.out.println(amount +" Yen "+" = " + (0.56*amount)+" rupees" );

}
public static void euro_to_others(double amount){


    System.out.println(" 1  euro = 158.15 Yen ");
    System.out.println(" 1  euro = 1.06 dollars");
    System.out.println(" 1  euro = 87.91 rupees");

    System.out.println();

    System.out.println(amount +" euro "+" = " + (158.15*amount)+" Yen" );
    System.out.println(amount +" euro "+" = " + (1.06*amount)+" dollars" );
    System.out.println(amount +" euro "+" = " + (87.91*amount)+" rupees" );

}



}
