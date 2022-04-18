package src.com.syntax.ReviewClass3;

import java.util.Scanner;

    public class CommonIssues2 {

        public static void main(String[] args) {


            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter number");
            int number=scanner.nextInt();
            System.out.println(number);
            System.out.println("Enter Name");
            scanner.nextLine();
            String name=scanner.nextLine();
            System.out.println(name);
            System.out.println("Program ended");
        }
    }
