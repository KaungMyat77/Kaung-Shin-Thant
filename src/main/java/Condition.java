import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String uName= sc.nextLine();


        String name="Kaung Shin Thant";
        int ps=1234;

        if(uName.equals(name)){
            System.out.println("Enter Your Password : ");
            int a =sc.nextInt();

            if(a==ps){
               System.out.println("Welcome To Our Future My Fri "+uName);
           }else{
               System.out.println("Your password is Wrong!");
           }



        }else{
            System.out.println("Your User Name is not correct");
        }


    }
}
