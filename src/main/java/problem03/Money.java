package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public boolean equals (Money money) {
		boolean result = false;
		if (this.amount == money.amount) result = true;
		return result;
	}

	public Money add(Money money) {
		Money result = new Money(this.amount);
		result.amount = this.amount + money.amount;
		
		return result;
	}

	public Money minus(Money money) {
		Money result = new Money(this.amount);
		result.amount = this.amount - money.amount;
	
		return result;
	}

	public Money multiply(Money money) {
		Money result = new Money(this.amount);
		result.amount = this.amount * money.amount;
		
		return result;
	}

	public Money devide(Money money) {
		Money result = new Money(this.amount);
		result.amount = this.amount / money.amount;
		
		return result;
	}
}