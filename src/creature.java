class GamingAccount{
    double balance;

    GamingAccount(double showBalance){
        this.balance = showBalance;
    }

    void deposit(double money){
        balance += money;
    }
    public double showBalance(){
        return balance;
    }
}

public class creature{
    static void main(String[] args){
        GamingAccount account = new GamingAccount(52);
        account.deposit(948);
        System.out.println("\u001B[31m" + "Your balance:" + " " + "\u001B[0m" + account.showBalance());
    }
}