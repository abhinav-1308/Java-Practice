/*4. Write a program in java to find no. of objects created out of a dass using 'static'
modifier.*/
public class lab7p4 {
 
private static int count;  

public lab7p4()   
{  

count++;  
}  
public static void main(String args[])   
{
lab7p4 ob1 = new lab7p4();  
lab7p4 ob2 = new lab7p4();  
lab7p4 ob3 = new lab7p4();  
lab7p4 ob4 = new lab7p4();  
lab7p4 ob5 = new lab7p4();  

System.out.print("Total Number of Objects: " + lab7p4.count);  
}  
}  

