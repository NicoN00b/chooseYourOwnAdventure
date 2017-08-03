import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Created by Guest on 8/3/17.
 */
public class App {
    public static void main(String[] args) {
        boolean GameStory = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input= "";


        try {
            while (GameStory){
                System.out.println("Welcome to your Morning ennui.  Your alarm rudely woke you up and the Sun is blasting through your curtain, beckoning you to rouse.  What do you do?");
                System.out.println(" ");
                System.out.println("Should you 'Get up' and face the day, or will you put your pillow over your head and go back to 'sleep' because there's nothing out there for you anyway.");
                input = bufferedReader.readLine();



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}