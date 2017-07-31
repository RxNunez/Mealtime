import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class MealTime {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("What did you eat for breakfast?");
            String yourBreakfast = bufferedReader.readLine();
            System.out.println("Your had " + yourBreakfast + " for breakfast.");

            System.out.println("What did you eat for lunch?");
            String yourLunch = bufferedReader.readLine();
            System.out.println("You had " + yourLunch + " for lunch.");

            System.out.println("What did you eat for dinner?");
            String yourDinner = bufferedReader.readLine();
            System.out.println("You had " + yourDinner + " for dinner.");


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}

