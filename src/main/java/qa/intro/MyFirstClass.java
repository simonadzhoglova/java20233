package qa.intro;

import java.util.Scanner;

public class MyFirstClass {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello, please enter your name:");

            String userName = scanner.nextLine();

            System.out.println("Nice to meet you, " + userName + "!");

            System.out.println("What's your favourite hobby?");

            String userHobby = scanner.nextLine();

            System.out.println("WOW " + userHobby + "!" +" That's sounds fun" + "!");


        }
}
