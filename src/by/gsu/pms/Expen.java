package by.gsu.pms;
public class Expen {
    private int rate = 25000;
    private String account;
    private int expenses;
    private int days;
    public Expen (String account, int expenses, int days){
        super();
        this.account = account;
        this.expenses = expenses;
        this.days = days;
    }

    public Expen() {
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public int getExpenses() {
        return expenses;
    }
    public void setExpenses(int expenses){
        this.expenses = expenses;
    }
    public int getDays () {
        return days;
    }
    public void setDays(int days){
        this.days = days;
    }

    public int getTotal() {
        return (rate + expenses)*days ;
    }
    public void show() {
        System.out.println("Rate = " + rate);
        System.out.println("Account = " + account);
        System.out.println("Transport = " + expenses);
        System.out.println("Days = " + days);
    }

    public String toString(){
        return rate + ";" + account + ";" + expenses + ";" + days + ";" + getTotal();
    }
}


