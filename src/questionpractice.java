import java.util.Scanner;

public class questionpractice {
   public static void main(String[] args) {
       System.out.println("Calculate percentage of five subjects");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value1");
       float a = sc.nextFloat();
       if (a<0||a>100)
       { System.out.println("Invalid marks!"); return;}
       System.out.println("Enter value2");
       float b = sc.nextFloat();
       if (a<0||a>100)
       { System.out.println("Invalid marks!"); return;}
       System.out.println("Enter value3");
       float c = sc.nextFloat();
       if (a<0||a>100)
       { System.out.println("Invalid marks!"); return;}
       System.out.println("Enter value4");
       float d = sc.nextFloat();
       if (a<0||a>100)
       { System.out.println("Invalid marks!"); return;}
       System.out.println("Enter value5");
       float e = sc.nextFloat();
       if (a<0||a>100)
       { System.out.println("Invalid marks!"); return;}
       float sum = a + b + c + d + e;
       System.out.print("Sum of these number: ");
       System.out.println(sum);
       float percentage = (sum/5);
       System.out.println("percentage =" + percentage + "%");


    }
}
