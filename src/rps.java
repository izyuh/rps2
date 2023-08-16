
import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String[] options = {"r", "p", "s"};
        String computerInput = options[new Random().nextInt(options.length)];
        String userInput;


        while (true) {
            while (true) {
                System.out.println("Please choose either r/p/s");
                userInput = scanner.next().toLowerCase();

                if ((userInput.equals("r") || (userInput.equals("p") || (userInput.equals("s"))))) {
                    break;
                } else {
                    System.out.println(userInput + " is not a valid input");
                    continue;
                }

            }

            Thread.sleep(400);

            System.out.println("I chose " + computerInput);
            Thread.sleep( 800);

            if (userInput.equals(computerInput)) {
                System.out.println("this game ends in a tie");
            } else if (userInput.equals("r")) {
                if (computerInput.equals("p")) {
                    System.out.println("You lose");
                } else if (computerInput.equals("s")) {
                    System.out.println("You win");
                }
            } else if (userInput.equals("p")) {
                if (computerInput.equals("s")) {
                    System.out.println("You lose");
                } else if (computerInput.equals("r")) {
                    System.out.println("You win");
                }
            } else if (userInput.equals("s")) {
                if (computerInput.equals("r")) {
                    System.out.println("You lose");
                } else if (computerInput.equals("p")) {
                    System.out.println("You win");
                }

            }

            Thread.sleep(800);

            System.out.println("would you like to play again? y/n");

            if(scanner.next().toLowerCase().equals("y")){
                continue;
            }else{
                break;
            }





        }
    }
}
