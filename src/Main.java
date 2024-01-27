public class Main {
    public static void main(String[] args) {

        GameManagementSystem gameManagementSystem = new GameManagementSystem();

        gameManagementSystem.startGame("Chess");

        gameManagementSystem.updateScore("Chess", 100);

        gameManagementSystem.finishGame("Chess");

        gameManagementSystem.startGame("Chess");
    }
}