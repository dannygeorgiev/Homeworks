import java.util.Scanner;

public class Homework301122 {

        public static void main(String[] args) {
            System.out.println("Please, enter your name:");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("Please, enter one of your hobbies:");
            String hobby = scanner.nextLine();

            System.out.println("Hello, " + name + "! It is so nice to hear your hobby is " + hobby + ".");
        }

}
