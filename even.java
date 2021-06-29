import java.util.*;
class even
{
public static void main(String args[])
{
int m,n;
Scanner sc = new Scanner(System.in);
System.out.println("enter m value");
m=sc.nextInt();
System.out.println("enter n value");
n=sc.nextInt();
while(m>=n)
{
if(m%2==0)
System.out.println(m);
m--;
}
}}