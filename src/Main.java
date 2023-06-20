/*
class RockPaperScissors
    main()
        string movePlayerA
        string movePlayerB
        string gameResponse

        do
            output "Enter Player A's move: "
            input movePlayerA

            output "Enter Player B's move: "
            input movePlayerB

            if movePlayerA == "R" then
                if movePlayerB == "R" then
                    output "It's a tie!"
                else if movePlayerB == "S" then
                    output "Rock breaks Scissors, Player A wins!"
                else
                    output "Paper covers Rock, Player B wins!"
                endIf
            else if movePlayerA == "S" then
                if movePlayerB == "R" then
                    output "Rock breaks Scissors, Player B wins!"
                else if movePlayerB == "S" then
                    output "It's a tie!"
                else
                    output "Scissors cuts Paper, Player A wins!"
                endIf
            else
                if movePlayerB == "R" then
                    output "Paper covers Rock, Player A wins!"
                else if movePlayerB == "S" then
                    output "Scissors cuts Paper, Player B wins!"
                else
                    output "It's a tie!"
                endIf
            endIf

            output "Do you want to repeat the game? Answer Y for yes and N for no: "
            input gameResponse
        while gameResponse == "Y"
    return
endClass

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String gameResponse = "";
        boolean done = false;

        do
        {
            do {
                System.out.print("Enter Player A's move: ");
                playA = in.nextLine();
                if(playA.matches("[RPS]") || playA.matches("[rps]"))
                {
                    done = true;
                }
            }while (!done);

            done = false;

            do {
                System.out.print("Enter Player B's move: ");
                playB = in.nextLine();
                if(playB.matches("[RPS]") || playB.matches("[rps]"))
                {
                    done = true;
                }
            }while (!done);

            if(playA.equalsIgnoreCase("R"))
            {
                if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock. Its a tie!");
                }
                else if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
                else //playB is Scissors
                {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            else if(playA.equalsIgnoreCase("P"))
            {
                if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper. Its a tie!");
                }
                else if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else //playB is Scissors
                {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            else //playA is Scissors
            {
                if(playB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors. Its a tie!");
                }
                else if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
                else //playB is Paper
                {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
            }

            done = false;

            System.out.print("Do you want to repeat the game? Answer Y for yes and N for no: ");
            gameResponse = in.nextLine();
            if(gameResponse.equalsIgnoreCase("Y"))
            {
                done = false;
            }
            else if(gameResponse.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while (!done);
    }
}