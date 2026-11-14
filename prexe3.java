import java.util.Scanner;
public class prexe3 {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        System.out.print("Enter second number: ");
        int number2=num2.nextInt();
        Scanner num3=new Scanner(System.in);
        System.out.print("Enter third number: ");
        int number3=num3.nextInt();
        int big_num=(number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        System.out.println("The biggest number is: "+big_num);
        num1.close();
        num2.close();
        num3.close();
    }
}
