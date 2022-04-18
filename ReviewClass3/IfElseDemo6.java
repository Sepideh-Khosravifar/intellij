package src.com.syntax.ReviewClass3;

public class IfElseDemo6 {

    public static void main(String[] args) {

        String day = "Friday";

        if (day.equals("Sunday")) {
            System.out.println("Its weekend");
        } else if (day.equals("Saturday")) {
            System.out.println("Its weekend");

        } else {
            System.out.println("Its weekday");
        }

        if (day.equals("Sunday") || day.equals("Saturday")) {
            System.out.println("Its weekend");

        } else {
            System.out.println("Its weekday");
        }

    }

}
