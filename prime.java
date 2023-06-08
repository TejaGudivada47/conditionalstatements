import java.util.Scanner;
class Prime{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter First limit : ");
int x = sc.nextInt();
System.out.print("Enter SEcond limit : ");
int y = sc.nextInt();
System.out.print("Prime numbers in the given range is : ");
for(int i=x;i<=y;i++){
int count=0;
for(int j=1;j<=i;j++){
if(i%j==0){
 count++;
}
}
if(count==2){
System.out.print(" " +i);
}
}
}
}
