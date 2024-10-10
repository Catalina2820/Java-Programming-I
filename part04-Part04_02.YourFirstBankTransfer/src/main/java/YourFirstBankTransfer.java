
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account cuenta1 = new Account("Matthews account", 1000);
        Account cuenta2 = new Account("My account", 0);
        cuenta1.withdrawal(100.0);
        cuenta2.deposit(100.0);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
