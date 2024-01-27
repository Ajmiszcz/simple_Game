import java.util.HashMap;
import java.util.Map;

class GameManagementSystem {
    private Map<String, Game> games;

    public GameManagementSystem() {
        this.games = new HashMap<>();
    }

    public void startGame(String gameName) {
        if (!games.containsKey(gameName)) {
            Game newGame = new Game(gameName);
            newGame.setStarted(true);
            games.put(gameName, newGame);
            System.out.println("Game started: " + newGame);
        } else {
            System.out.println("Game is already started.");
        }
    }


    public void finishGame(String gameName) {
        Game game = games.get(gameName);
        if (game != null && game.isStarted() && !game.isFinished()) {
            game.setFinished(true);
            System.out.println("Game finished: " + game);
        } else {
            System.out.println("Cannot finish the game. Make sure the game is started and not already finished.");
        }
    }
    public void updateScore(String gameName, int score) {
        Game game = games.get(gameName);
        if (game != null && game.isStarted() && !game.isFinished()) {
            game.setScore(score);
            System.out.println("Score updated for " + gameName + ": " + game.getScore());
        } else {
            System.out.println("Cannot update the score. Make sure the game is started and not finished.");
        }
    }
}
