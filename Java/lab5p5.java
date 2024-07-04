/*5.Palindrome or not.*/

public class lab5p5 {
public static void main(String args[]){
int a = 523587;
int r;
int n = 0;
int p = 0;
while(n!= 0){
    r = n%10;
    p = p*10+r;
    n= n/10;
}

if(a == p){
System.out.println("It is PALINDROME");
}
else{
System.out.println("It is not a PALINDROME");
}
}
}