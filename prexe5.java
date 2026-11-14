import java.util.Scanner;

public class prexe5 {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.print("Enter marks scored: ");
        int marks=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        int attend=num2.nextInt();
        String scholar=(marks>=90 && attend>=80)?"Scholarship Granted":"Scholarship Not Granted";
        System.out.println(scholar);
        num1.close();
        num2.close();
    }
}
