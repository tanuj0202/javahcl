package DAYone;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int balance = 10000;

        int deposite, withdraw;
        int choice;
        boolean open = true;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("--------Enter you choice-------");
            System.out.println("Press 1 for balance: ");
            System.out.println("Press 2 for deposite: ");
            System.out.println("Press 3 for withdraw: ");
            System.out.println("Press 4 for exit: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.print("Enter depoiste amount");
                    deposite = sc.nextInt();
                    if(deposite > 0) System.out.println(balance + deposite);
                    else System.out.println("Not possible");
                    case 3:
                        System.out.print("Enter withdraw amount");
                        withdraw  = sc.nextInt();
                        if(withdraw <= balance) System.out.println(balance - withdraw);
                        else System.out.println("Not possible");
                    break;
                    case 4:
                        open = false;
                        break;
                default:
                    System.out.println();
            }
        } while (open);

        sc.close();
    }
}
