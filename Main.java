import  java.util.Random;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int goal = 100;
        int points = 0;
        int target = random.nextInt(goal) + 1;

        while (true){
            System.out.println("== Number guessing game ==");
            System.out.println("Points: " + points);
            System.out.print("Enter any number: ");
            int randomNumber = Integer.parseInt(scanner.nextLine());

            if (randomNumber == target){
                System.out.println("You guessed correctly!");
                points += 1;
            } else if (randomNumber < target){
                System.out.println("Warmer! the number was : " + target);
            } else {
                System.out.println("Hotter! the number was : " + target);
            }
            System.out.println("Points earned: " + points);

            System.out.print("Do you like tryagain? y/n: ");
            String yN = scanner.nextLine();
            if (yN.equalsIgnoreCase("y")){
                target = random.nextInt(goal) + 1;
                continue;
            } else if (yN.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
