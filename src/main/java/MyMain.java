import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        // Write some code here!
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "! It's nice to meet you!");
        System.out.print("What is your favorite color, " + name + "? ");
        String color = scan.next();
        System.out.print("Oh I like " + color + " too!");
        scan.close();



    }
}
