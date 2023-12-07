package inicio;

import java.util.Locale;
import java.util.Scanner;

import transactions.calculos;

public class NewBank {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner addedByUser = new Scanner(System.in);
    calculos sis = new calculos();
    int opt = addedByUser.nextInt();
    
    System.out.println("1 for Sign in or 2 for Sign Up");
    opt = addedByUser.nextInt(); 
    
    
    
    
    
    
    
    System.out.println("BANK THE STRAIGHT");
    System.out.println();
    System.out.printf("Cardholder Name:");
    System.out.println();
    System.out.printf("Number Count:");
    System.out.println();
    System.out.print("Money in account: R$" + sis.getDinheiro());
    System.out.println();
    double opt2;
    System.out.println("1 para sacar, ou 2 para depositar");
    
    if(opt==1) {
      System.out.printf("Valor do saque:");
      opt2 = addedByUser.nextDouble();
     sis.setRemoveMoney(opt2);
    }
    if (opt==2) {
      System.out.println("Valor do deposito:");
       opt2 = addedByUser.nextDouble();
       sis.setAddMoney(opt2);
    }
  }

}
