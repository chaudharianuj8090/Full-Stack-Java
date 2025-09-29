import java.util.*;
class Main1
{
 public static void main(String[] args)

{
Scanner sc =  new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

try
{
 int res = a/b;
 System.out.println("Result: "+res);
}

catch(ArithmeticException AE)
{
System.out.println("Exception ===>" +AE);
b=1;
}

finally

{
System.out.println("Exception not occured");
}

}
}
