import java.util.Scanner;
public class vdo18_elseif {
   public static void main(String[] args) {
       int age;
       System.out.println("Enter your age");
       Scanner sc = new Scanner(System.in);
       age = sc.nextInt();

       if (age>30){
           System.out.println("old age");}
           else if(age>18) {
           System.out.println("adult");}
           else if (age>13){
           System.out.println("teenager");}
           else if (age<13){
           System.out.println("child");}

           int age1;
       System.out.println("Enter your age");
       Scanner sc1 = new Scanner(System.in);
       age1 = sc.nextInt();

       switch (age1) {
           case 18:
               System.out.println("Adult");
               break;
           case 45:
               System.out.println("old");
               break;
           case 13:
               System.out.println("child");
               break;
       }








    }
}
