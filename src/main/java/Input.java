import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();

        System.out.println("Welcome! "+name);
        System.out.println("Your age is "+age);

    }
}
