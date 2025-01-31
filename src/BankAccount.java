public class BankAccount {


    public static void main(String[] args) {

        float myBalance = 2175.37f;
        System.out.println("Bob's checking account balance: " + myBalance);

        
        System.out.println("Bob withdrew: $302.50");
        myBalance -= 302.50;

        System.out.println("Bob deposited $50.03");
        myBalance += 50.03;

        System.out.println("Bob withdrew: $961.45 & deposited $20.00");
        myBalance /= 2;
        myBalance += 20;
        
        System.out.println("Bob withdrew: $1.00");
        --myBalance;

        System.out.println("Bob deposited: $980.45");
        myBalance *= 2;

        System.out.println("Bob deposited: $1.00");
        ++myBalance;

        System.out.println("Bob's remaining balance: $" + String.format("%.2f", myBalance));
        

    }

}
