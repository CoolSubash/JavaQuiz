package Rockpaper;

import java.util.Random;
import java.util.Scanner;

public class Rock {

    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Lets Play a Rock Scissors Game");
        System.out.println("Choose 0 for Rock, 1 for Paper, and 2 for Scissors");
        int usernumber=number.nextInt();
        System.out.println("You choose " + usernumber);
        Random rand = new Random();
        int computernumber=rand.nextInt(3);

        if(usernumber == computernumber){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("Game is Draw");
        }else if(computernumber == 0 && usernumber == 2){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You loss the game");
        }else if (computernumber == 0 && usernumber == 1){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You win the game");
        }else if(computernumber == 1 && usernumber == 0){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You win the game");
        }else if(computernumber == 1 && usernumber == 2){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You loss the game");
        }else if(computernumber == 2 && usernumber == 0){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You loss the game");
        }else if(computernumber == 2 && usernumber == 1){
            System.out.println("The computer Choose " + computernumber);
            System.out.println("You win the game");
        }

    }
}
