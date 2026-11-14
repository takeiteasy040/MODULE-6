import java.util.Scanner;
public class prexe4 {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.print("Enter first side: ");
        int number1=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        System.out.print("Enter second side: ");
        int number2=num2.nextInt();
        Scanner num3=new Scanner(System.in);
        System.out.print("Enter third side: ");
        int number3=num3.nextInt();
        String is_pythagorean_triplet=(number1*number1+number2*number2==number3*number3||number2*number2+number3*number3==number1*number1||number3*number3+number2*number2==number1*number1)?"Pythagorean Triplet":"Not a Pythagorean Triplet";
        System.out.println(is_pythagorean_triplet);
        num1.close();
        num2.close();
        num3.close();
    }
}
