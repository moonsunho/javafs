package a0705;

public class AccountTest1 {
    public static void main(String[] args) {
        Account1 a = new Account1("123-45",10000);
        Account1 b = new Account1("567-89",10000);
        while (a.transfer(b,3000)) {
            ;   
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}
class Account1{
    String num;
    int balance;
    public Account1(String num, int balance){
        this.num = num;
        this.balance = balance;
    }
    public boolean transfer(Account1 account1, int amount){
        if (balance < amount){ // 3000보다 잔액이 부족하면 종료
            return false;
        }
        balance -= amount;
        account1.balance += amount;
        return true;
    }
    public String toStr(){
        return String.format("Account { num: %s, balance: %d}", num,balance);
    }
}