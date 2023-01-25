import java.util.Scanner;
class Positive
{
public static void main(String[] args){
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number whether it is positive or negative\n");
a=sc.nextInt();
if(a>=0)
{
System.out.println("your number is positive");
}
else
{
System.out.println("your number is negative ");
}
}
}
