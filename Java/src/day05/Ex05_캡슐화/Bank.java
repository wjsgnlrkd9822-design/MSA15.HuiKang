package day05.Ex05_캡슐화;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account("12345-6789", "김조은");
		// account.balance;
		// balance 변수는 private로 지정했기 떄문에, 접근 불가
		// 입금
		account.deposit(50000);
		//출급
		account.withdraw(10000);
		
		double money = account.getBalance();
		System.out.println("예금액 : " + money );
		System.out.println("예금주" + account.getAccountHolder());
		System.out.println("계좌번호" + account.getAccountHolder());
		
	}
}
