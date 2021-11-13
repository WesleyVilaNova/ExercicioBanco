package dados;

public class Pessoal {

	static int number;
	public String holder;
	public double balance;
	
	public Pessoal(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Pessoal(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit (initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit ( double amount) {
		balance = balance + amount; 
	}
	
	public void whithdraw (double amount) {
		balance = balance - amount + 5.0 ;
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", balance: $" 
				+ String.format("%.2f",balance);
	}
	
	
}
