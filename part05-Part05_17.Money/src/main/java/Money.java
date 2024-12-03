
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money money1 = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return money1;
    }
    
    public boolean lessThan(Money compared){
        return ((this.euros * 100 + this.cents) < (compared.euros * 100 + compared.cents)); 
    }
    
    public Money minus(Money decreaser){
        int total = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
        
        if (total > 0) {
           return new Money(total / 100, total % 100);
        } else {
            return new Money(0,0);
        }
    }
}
