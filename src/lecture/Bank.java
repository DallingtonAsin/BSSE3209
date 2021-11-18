package lecture;

import java.util.*;
public class Bank {

    public static void getTotalPayable(String bank, double principal, int years) {
        // local class named Interest
         class Interest{
           double bank_interest_rate = 0.0;

               Interest(String bank){
                 switch (bank) {
                   case "Centenary":
                      bank_interest_rate = 3.2;
                      break;
                   case "Stanbic":
                         bank_interest_rate = 2.8;
                     break;
                   case "Equity":
                         bank_interest_rate = 3.15;
                     break;
                       default:
                         bank_interest_rate = 1.5;
    }

    }
               
  // method in local class that returns interest
    public double getInterestRate() {
     return bank_interest_rate;
    }

 }

Interest obj = new Interest(bank);
double amount = Math.round(principal*
               (1 + (obj.getInterestRate()*years)));

System.out.println("The total amount payable for principal "+principal+" after "+years+" years in "+bank+" bank whose interest is "+obj.getInterestRate()+" is "+amount);

 }


    public static void main(String[] args) {
        double amt = 100000;
        int years = 3;
        getTotalPayable("Centenary", amt, years);
        getTotalPayable("Stanbic", amt, years);
        getTotalPayable("Equity", amt, years);

    }

}
