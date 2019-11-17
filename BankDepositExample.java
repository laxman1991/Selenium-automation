package BasicProgram.softedge;
import java.util.Scanner;
public class BankDepositExample {

	static String employee_name;
	static String bank_name;
	static double Opening_bank_balance; 
	static double deposit_amount;
	static double withdraw_amount;
	static double closing_balance;
	static double balance;
	public static void openingBalance(double Opening_bank_balance)
	{
		System.out.println("Opening balance is: "+Opening_bank_balance);
		
	}
	public static void deposit(double deposit_amount)
	{
		deposit_amount=deposit_amount+Opening_bank_balance;	
	     System.out.println("Total deposit amount is:"+deposit_amount);
	}
	public static void withdrawAmount(double withdraw_amount,double balance)
	{
	   if(withdraw_amount>deposit_amount)	
	   {
		   System.out.println("Your account is running insufficient balance.");
	   }
	   /*else
	   {
		   balance=deposit_amount-withdraw_amount;
		   System.out.println("dddddd   "+balance);  
	   }*/
	}
	public static void closingBalance(double Opening_bank_balance,double deposit_amount,double withdraw_amount)
	{
		closing_balance=Opening_bank_balance+deposit_amount-withdraw_amount;
		System.out.println("Closing bank balance is: "+closing_balance);
	}
	public static void main(String[] args) {
     
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter opening balance");
      Opening_bank_balance=scanner.nextDouble();
      openingBalance(Opening_bank_balance);
      //deposite amount into bank.
      System.out.println("Enter deposite amount:");
      deposit_amount=scanner.nextDouble(); 	
      deposit(deposit_amount);
      System.out.println("Enter withdraw amount");
      withdraw_amount=scanner.nextDouble();
      withdrawAmount(withdraw_amount,balance);
      System.out.println("Closing balanced is banks is as follows:");
      closingBalance(Opening_bank_balance,deposit_amount,withdraw_amount);
      scanner.close();
	}
}
