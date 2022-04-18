package src.com.syntax.class33;

//How would you handle InputMismatchException? Input Mismatch
//Exception when user enters a mismatch value other than what the programmer expected.

import java.util.InputMismatchException;
import java.util.Scanner;

        public class inputMismatchException {

        public static void main(String[] args) {



            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Pls Enter an Integer Value: ");
                Integer inputInt = scanner.nextInt();                   // input : "11.6"
                System.out.println(inputInt);
            }

            catch (InputMismatchException ime) {
                System.out.println("Wrong input pls input a float value instead "+ ime);
            }
        }
    }


/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        How would handle InputMismatchException? Input Mismatch
        Exception when user enters mismatch value then programmer expected.
         */
       /* try{
                Scanner scanner =new Scanner(System.in);
                System.out.println(scanner.nextInt());
                }catch (InputMismatchException inputMismatchException){
                System.out.println("Please enter the correct type of data");
                }

                }
                }*/



