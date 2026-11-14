import java.util.Scanner;
public class prexe1 {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int Age=age.nextInt();
        String elig=(Age>=18)?"Eligible":"Not Eligible";
        System.out.println(elig);
        age.close();
    }
}
