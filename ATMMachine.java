import java.util.*;
class ATM {
    float Balance;
    int PIN = 1818;

    public void checkPin(){
        System.out.println("Enter your pin:");
        Scanner sc =new Scanner(System.in);
        int userPin = sc.nextInt();
        if(userPin==PIN){
            menu();
        }
        else {
            System.out.println("Enter valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option ==2){
            withdrawMoney();
        } else if (option ==3) {
            depositMoney();
        } else if (option ==4) {
            return;
        }
        else {
            System.out.println("Enter valid option!");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient balance");
        }
        else{
            Balance-=amount;
            System.out.println("withdrawal successful, Balance amount:"+Balance);
        }
        menu();

    }

    public void depositMoney(){
        System.out.println("Enter deposit amount:");
        Scanner sc =new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance+=amount;
        System.out.println("Amount deposit successful, Balance amount:"+Balance);
        menu();
    }

}

public class ATMMachine{
    public static void main(String[] args){
    ATM Obj = new ATM();
    Obj.checkPin();
    }
}

