class BankTransactionAppln
{
 int CurrentAmt = 10000;
 int WithdrawAmt = 5000;
 int DepositeAmt = 7000;
 public void Withdraw()
 {
	 CurrentAmt = CurrentAmt - WithdrawAmt;
	 System.out.println(" After the withdrawAmt the current amount is :" +CurrentAmt);
 }
 public void Deposite()
 {
	 CurrentAmt = CurrentAmt + DepositeAmt;
	 System.out.println(" After the Deposite the current amount is :" +CurrentAmt);
 }
}
	 