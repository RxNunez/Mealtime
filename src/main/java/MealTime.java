import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class MealTime {
    public static void main(String[] args) {

        askForWhatYouAteFor("breakfast");
        askForWhatYouAteFor("lunch");
        askForWhatYouAteFor("dinner");
    }

    public static void askForWhatYouAteFor(String meal) {

        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for " + meal + "?");
            String yourMeal = bufferedReader.readLine();
            System.out.println("you had " + yourMeal + " for " + meal + ".");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

