import java.util.*;

interface A {
    public void deposit();
    public void withdraw();
}

public class BankDemo {
    Scanner scan = new Scanner(System.in);
    int acc_no, bal;

    public class NAE extends Exception {
        String m = "User defined Exception. The amount you entered is negative.";
    }

    public void deposit() throws NAE {
        int k;
        do{
            try{
                int dep; 
                System.out.println("Enter the amount you want to deposit.");
                dep = scan.nextInt();
                if(dep < 0){
                    throw new NAE();
                }
                else{
                    bal = bal + dep;
                    System.out.println("Deposit Successful.");
                }

            }

            catch (NAE e){
                System.out.println("Exception Encountered." +e.m);
            }

            System.out.println("To try again enter 1, to exit enter 0.");
            k = scan.nextInt();
            }while(k != 0);
        }


        public void withdraw() throws NAE {
            int k;
            do{
                try{
                    int wd; 
                    System.out.println("Enter the amount you want to withdraw.");
                    wd = scan.nextInt();
                    if(wd < 0){
                        throw new NAE();
                    }
                    else{
                        if(bal >= wd){
                        bal = bal - wd;
                        System.out.println("Withdrawl Successful.");
                        }

                        else
                        {
                            System.out.println("Insuffecient Balance.");
                        }
                    }
    
                }
    
                catch (NAE e){
                    System.out.println("Exception Encountered." +e.m);
                }
    
                System.out.println("To try again enter 1, to exit enter 0.");
                k = scan.nextInt();
                }while(k != 0);
            }

            public static void main(String[] args) throws NAE {
                Scanner scan = new Scanner(System.in);
                bank b1 = new bank();
                System.out.println("Enter the account number: ");
                b1.acc_no = scan.nextInt();
                System.out.println("Enter the balance: ");
                b1.bal = scan.nextInt();

                b1.deposit();
                b1.withdraw();
                System.out.println("\n\nAccount details-:");
                System.out.println("Account number:" +b1.acc_no);
                System.out.println("Balance:" +b1.bal);

            }

    }