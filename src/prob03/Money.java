package prob03;

public class Money {

	private int amount;
    
	public Money(int num) {
		amount = num;
	}
    public Money add(Money money) {
    	Money nw = new Money(amount+money.amount); 
    	return nw;
    }
    public Money minus(Money money) {
    	Money nw = new Money(amount-money.amount);    
    	return nw;
    }
    public Money multiply(Money money) {    	
    	Money nw = new Money(amount*money.amount);     	
    	return nw;
    }
    public Money devide(Money money) {
    	Money nw = new Money(amount/money.amount);    
    	return nw;
    }
    public boolean equals(Money money) {
    	return this.amount==money.amount;    	
    }
}
