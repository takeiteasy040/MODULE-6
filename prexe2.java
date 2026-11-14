import java.util.Scanner;
public class prexe2 {
    public static void main(String[] args) {
        Scanner iss=new Scanner(System.in);
        System.out.print("Are you a student or not (true/false): ");
        Boolean isStudent=iss.nextBoolean();
        Scanner ism=new Scanner(System.in);
        System.out.print("Are you a member or not (true/false): ");
        Boolean isMember=ism.nextBoolean();
        Scanner hasc=new Scanner(System.in);
        System.out.print("Do you have a coupon or not (true/false): ");
        Boolean hasCoupon=hasc.nextBoolean();
        String disc1=(isStudent==true)?"Discount":"No Discount";
        String disc2=(isMember==true)?"Discount":"No Discount";
        String disc3=(hasCoupon==true)?"Discount":"No Discount";
        System.out.println("Student Discount: "+disc1);
        System.out.println("Member Discount: "+disc2);
        System.out.println("Coupon Discount: "+disc3);
        iss.close();
        ism.close();
        hasc.close();
    }
}
