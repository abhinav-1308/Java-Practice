/*4.Program to print the corresponding week day for the given day no. of the curent month using switch.case statement in Java*/

public class lab5p4 {

    public static void main(String s[])
    {
        int day = 2;
        
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}

