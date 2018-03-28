import java.time.Duration;
import java.time.LocalDateTime;

public class FuzzBuzz {

    public static void main(String[] args) {

        int range = 100;

        // save time
        LocalDateTime startTime = LocalDateTime.now();

        fuzzBuzz(range);

        // print time difference in ms
        System.out.println("Dauer: " + Duration.between(startTime, LocalDateTime.now()).toMillis());
    }

    public static void fuzzBuzz(int range) {

        int i = 1;  // Iterator durch alle Zahlen von 1 bis 100
        String stepwiseOutput;

        while(i <= range) {

            int k = i;

            if (k % 15 == 0) {
                stepwiseOutput = "FuzzBuzz";
            } else if (k % 5 == 0) {
                stepwiseOutput = "Buzz";
            } else if (k % 3 == 0) {
                stepwiseOutput = "Fuzz";
            } else {
                stepwiseOutput = Integer.toString(i);
            }

            System.out.println(stepwiseOutput);
            i++;
        }
    }
}
