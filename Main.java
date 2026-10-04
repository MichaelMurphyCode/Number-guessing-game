import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        int number = scanner.nextInt();
        System.out.println("Company: ");
        String company = scanner.next();
        System.out.println("Adjective: ");
        String adjective = scanner.next();
        System.out.println("Noun (1): ");
        String noun1 = scanner.next();
        System.out.println("Verb: ");
        String verb = scanner.next();
        System.out.println("Noun (2): ");
        String noun2 = scanner.next();
        System.out.println("Body part: ");
        String bodyPart = scanner.next();
        System.out.println("Number (2): ");
        int number2 = scanner.nextInt();
        System.out.println("Noun (3): ");
        String noun3 = scanner.next();
        System.out.println("Food: ");
        String food = scanner.next();
        String story = """
                Today I started my job at %s at exactly %d o'clock.

                My boss told me to be %s and gave me a %s to work with.

                I had to %s the %s using my %s.

                After doing that %d times, I found a %s sitting next to my desk.

                I was hungry, so I grabbed some %s and decided that maybe
                this job wasn't so bad after all!
                """.formatted(
                company,
                number,
                adjective,
                noun1,
                verb,
                noun2,
                bodyPart,
                number2,
                noun3,
                food
        );
        System.out.println(story);
        scanner.close();
    }
}