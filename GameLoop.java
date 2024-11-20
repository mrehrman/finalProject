import java.util.Scanner;

public class GameLoop{

    public static void main(String[] args) {
        boolean playing = true;

        Scanner userInput = new Scanner(System.in);

        String userResponse = "";


        System.out.println("Welcome to the library. Your task is to retrieve the stolen books.");

        System.out.println("Enter anything to play. Enter 'QUIT' to exit the game.");


        while (playing) {
            System.out.println("What would you like to do?");
            userResponse = userInput.nextLine();
            if (userResponse.toUpperCase().equals("QUIT")){
                playing = false;
                System.out.println("You have quit the game.");
            } else{
                playing = true;
            }
        }

        userInput.close();   

    }
    }

