import java.util.Scanner;
class Large{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int n1,rem,lardigit=0;
while(n>0){
rem = n%10;
if(lardigit<rem){
lardigit=rem;
}
n=n/10;
}
System.out.println(lardigit);
}
}