//Maria deposited her money in time deposit at a bank is Php 30000. The bank gave her 12% for a term of 30 days. There is a 10% withholding tax to be deducted from the interest. (A)Find her withholding tax. (B) Find the net interest she will receive. Use the following formula; I = Prt, where I-Interest, P-Principal value, Rate of interest and T-time.



public class ACTIVITY_4 {
  
    public static void main(String[] args) {
        double principal = 30000; 
        double rate = 0.12; 
        int time = 30; 
        double interest = principal * rate * (time / 365.0); 
        double withholdingTax = interest * 0.10; 
        double netInterest = interest - withholdingTax;

       
        System.out.println("Withholding Tax: PHP " + withholdingTax);
        System.out.println("Net Interest: PHP " + netInterest);
    }
}


