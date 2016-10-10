
public class Account {
	private int accountID;
	private String accountName;
	private int balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void add_funds(int to_add){
		balance += to_add;
	}
	
	public void sub_funds(int to_sub){
		if (balance >= to_sub)
		{
			balance -= to_sub;
		}
	}
	

}
