//problem: create simple car loan payment calculator. 
//combine a few of the concepts that you have learned so far: conditionals, boolean expressions, and arithmethic expressions.
//decision:

public class CarLoan {
	public static void main(String[] args) {

int carLoan = 10000; // loan amount.
int loanLength = 3; // how many years you should pay.
int interestRate = 5; // an interest rate of 5% on the loan.
int downPayment = 2000; // the down payment provided by a user.


if ((loanLength <= 0) || (interestRate <= 0)){
  System.out.println("Error! An invalid car loan!");
} else if (downPayment > carLoan){
  System.out.println("The car can be paid in full");
} else if (downPayment == carLoan){
  System.out.println("The car can be paid in full");
	}

else {
  int remainingBalance = carLoan - downPayment; // balance after payment
  int months = loanLength * 12; // convert years to months.
  int monthlyBalance = remainingBalance / months; // the monthly payment without interest included.
  int interest = monthlyBalance * interestRate / 100; // interest.
  int monthlyPayment = monthlyBalance + interest; // the final monthly payment.

  System.out.println("The monthly payment is " + monthlyPayment + ".");
}
}
}
