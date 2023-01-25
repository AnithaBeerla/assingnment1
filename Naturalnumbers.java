import java.util.Scanner;

class Naturalnumbers
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("enter a number to natural numbers upto number");

int n=sc.nextInt();

System.out.println("natural numbers upto  "+n+" Are:");

for (int i=1;i<=n;i++)
{
System.out.println(i);
}
}
}

