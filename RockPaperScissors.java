import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0 is for Rock");
        System.out.println("1 is for Paper");
        System.out.println("2 is for Scissors");

        int computer_choice;
        int computerwon = 0; 
        int my_choice;
        int me = 0;
        int game = 0;
        while (game < 5) {
            Random rand = new Random();
            computer_choice = rand.nextInt(3); 
            System.out.print("Enter your choice (0, 1, or 2): ");
            my_choice = sc.nextInt();


            if (my_choice < 0 || my_choice > 2) {
                System.out.println("Invalid choice. Please choose 0, 1, or 2.");
                continue;
            }

            switch (my_choice) {
                case 0:
                    System.out.println("You chose Rock");
                    break;
                case 1:
                    System.out.println("You chose Paper");
                    break;
                case 2:
                    System.out.println("You chose Scissors");
                    break;
            }


            switch (computer_choice) {
                case 0:
                    System.out.println("Computer chose Rock");
                    break;
                case 1:
                    System.out.println("Computer chose Paper");
                    break;
                case 2:
                    System.out.println("Computer chose Scissors");
                    break;
            }


            if (computer_choice == my_choice) {
                System.out.println("It's a tie!");
            } else if ((my_choice == 0 && computer_choice == 2) || 
                       (my_choice == 1 && computer_choice == 0) || 
                       (my_choice == 2 && computer_choice == 1)) {
                System.out.println("You won this round!");
                me++;
            } else {
                System.out.println("Computer won this round!");
                computerwon++;
            }

            game++;
            System.out.println("Score: You - " + me + ", Computer - " + computerwon);
            System.out.println("-------------------------------------------------------------");
        }

        
        if (me > computerwon) {
            System.out.println("Congratulations! You won the game!");
        } else if (me < computerwon) {
            System.out.println("Computer won the game. Better luck next time!");
        } else {
            System.out.println("The game is a tie!");
        }

        sc.close(); 
    }
}