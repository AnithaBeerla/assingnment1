import java.util.Scanner;

class Productinfo

{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("programme to dispaly the product information"); 
System.out.println("--------------------------------------- ");
System.out.println("enter the product_id");
int a=sc.nextInt(); 
System.out.println("enter the product name");
String b=sc.next();
System.out.println("enter the product price");
int c=sc.nextInt();
System.out.println("enter the product of category");
String d=sc.next();
System.out.println("enter the brand of the product");
String e=sc.next();
System.out.println("\n\nthe info about the product you entered is :");
System.out.println("product_id : "+a);
System.out.println("product name : "+b);
System.out.println("product price : "+c);
System.out.println("product of category : "+d);
System.out.println("brand of the product : "+e);
}
  }