import java.util.Scanner;
class Check{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
if(num>0){
System.out.println("Given number is a postive");
} 
else{
System.out.println("Given number is a negative");
}
}
}
