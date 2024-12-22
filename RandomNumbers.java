import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();
        
        // Generate and print 5 random 4-digit numbers
        for (int i = 0; i < 5; i++) {
            // Generate a random number between 1000 and 9999
            int randomNumber = 1000 + random.nextInt(9000);  // nextInt(9000) generates numbers 0 to 8999
            System.out.println(randomNumber);
        }
    }
}
