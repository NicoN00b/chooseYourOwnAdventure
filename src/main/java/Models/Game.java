package Models;

public class Game {

    public String [] playerOptions = {"sleep", "get up"};
    public String input = null;
    public String playerResult = input;

    public String choiceEvaluator() {
//        choiceOne = options[0];
//        choiceTwo = options[1];
       for (Integer index = 0 ; index < playerOptions.length; index++) {
           if (input.equals(playerOptions[0])) {
               return "Good choice, in your sleep, you are free.";
           } else if (input.equals(playerOptions[1])) {
               return "The Slog Continues";

           }

       }
       return "Game Over";
    }
}

