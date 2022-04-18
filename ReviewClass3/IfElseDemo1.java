package src.com.syntax.ReviewClass3;

public class IfElseDemo1 {

    public static void main(String[] args) {

        String userName="Asghar";
        String password="pass124";

        if(userName.equals("Asghar") && password.equals("pass123")) {

            System.out.println("welcome back "+userName);
        } else {

            System.out.println("UserName or password is not correct");
        }
    }
}
