package Models;

public class Game {

    private String [] options = {"get up", "sleep"};
    private String input = null;

    public String choiceEvaluator(String choiceOne, String choiceTwo) {
        choiceOne = options[0];
        choiceTwo = options[1];
        return choiceTwo;
    }
}
