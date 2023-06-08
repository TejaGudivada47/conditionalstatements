import java.util.Scanner;
class MaxandMin{
public static void main(String[]args){
int num[]=new int[5];
Scanner sc = new Scanner(System.in);
for(int i=0;i<num.length;i++){
System.out.println("Enter a number");
num[i]=sc.nextInt();
}
int min=num[0];
int max=num[0];
for(int i=0;i<num.length;i++){
if(num[i]<min){
min=num[i];
}
if(num[i]>max){
max=num[i];
}
}
System.out.println("min : "+min);
System.out.println("max : "+max);
}
}