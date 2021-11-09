import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= sc.nextLine();
         String yourname="Kaung Shin Thant";
        int ps=123456;
        if (name.equals(yourname)){
//            System.out.println("Your Right");
            System.out.println("Enteryourps");
            int a=sc.nextInt();
           if (a==ps){
               System.out.println("Welcome To Our Future My Fri "+name);

           }else {
               System.out.println("no");

           }
        }else {
            System.out.println("You right");
        }





























        }

}