/*Write a program in java to create a class Bank having ROI (Rate of Interest ) data
member and find_ROI() member function. Derive two classes HDFC, ICICI with find_ROI()
function . The ROI of HDFC bank is calculated as ROI = (Last year annual profit / 1.5
crore ) where the annual profit is an user entered value. The ROI of ICICI bank is
calculated as ROI = Fund supported by RBI in crore / 1.5 Crore where Fund supported by
RBI is an user entered value. So find the rate of interest of all the Banks using dynamic
method dispatch technique*/

import java.util.Scanner;

// Parent class Bank
class Bank {
    protected double ROI;

    // Method to find the Rate of Interest
    public void find_ROI() {
        System.out.println("Rate of Interest: " + ROI);
    }
}

// Child class HDFC
class HDFC extends Bank {
    private double annualProfit;

    // Constructor to initialize annualProfit
    public HDFC(double annualProfit) {
        this.annualProfit = annualProfit;
        this.ROI = annualProfit / 1.5;
    }

    // Method overriding to find the Rate of Interest
    @Override
    public void find_ROI() {
        System.out.println("Rate of Interest for HDFC: " + ROI);
    }
}

// Child class ICICI
class ICICI extends Bank {
    private double fundByRBI;

    // Constructor to initialize fundByRBI
    public ICICI(double fundByRBI) {
        this.fundByRBI = fundByRBI;
        this.ROI = fundByRBI / 1.5;
    }

    // Method overriding to find the Rate of Interest
    @Override
    public void find_ROI() {
        System.out.println("Rate of Interest for ICICI: " + ROI);
    }
}

// Main class to test the classes
public class lab9p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating an object of HDFC
        System.out.print("Enter Annual Profit of HDFC (in crores): ");
        double annualProfit = input.nextDouble();

        HDFC hdfc = new HDFC(annualProfit);
        hdfc.find_ROI();

        // Creating an object of ICICI
        System.out.print("Enter Fund Supported by RBI for ICICI (in crores): ");
        double fundByRBI = input.nextDouble();

        ICICI icici = new ICICI(fundByRBI);
        icici.find_ROI();
    }
}
