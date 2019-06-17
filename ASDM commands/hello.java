//to check whether the number is even or odd

import java.util.Scanner;
class CheckEvenOdd
{
public static void main(string args[])
{
int n;
System.out.println("enter an integer");
Scanner sc = new Scanner(System.in) 
n = sc.nextInt();
if (n%2==0)
System.out.println("entered number is even");
else
System.out.println("entered number is odd");
}
}