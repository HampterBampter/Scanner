import java.util.Scanner;
    public class Greeting {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What's your name? ");
            String text = scan.nextLine();
            System.out.println("Hi " + text);
        }
}

    class HelloThere {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hello there! How are you doing today?");
            String text = scan.nextLine();
            System.out.println(text);
            System.out.println("Wow - Interesting. Tell me more about yourself!");
            String text1 = scan.nextLine();
            System.out.println(text1 + "\nNice chatting with you! Goodbye!");
        }
    }

    class Superhero {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lets write a story about a superhero.\nWho is the hero of our story?");
            String text = scan.nextLine();
            System.out.println("What is their superpower?");
            String text1 = scan.nextLine();
            System.out.println("Here is the story:\n"
                    + "There once was a superhero named, " + text + " who had the power of " + text1 + ".\n"
                    + "As they grew older, " + text + " saw that the world needed them.\n"
                    + text + " used their ability to " + text1 + " to save the world.");
        }
    }

    class VariableInputs {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string of text:");
            String text = scan.nextLine();
            System.out.println("Enter an integer:");
            int text2 = Integer.valueOf(scan.nextLine());
            System.out.println("Enter a double:");
            double text3 = Double.valueOf(scan.nextLine());
            System.out.println("Enter a boolean value:");
            boolean text4 = Boolean.valueOf(scan.nextLine());
            System.out.println("Your string is " + text
                    + "\nYour integer is " + text2
                    + "\nYour double is " + text3
                    + "\nYour boolean is " + text4);
        }
    }
