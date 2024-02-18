public class Application {
    public static void main(String[]args){
        GameManager gameManager = new GameManager();
        gameManager.setGame(new FootballGame());
        gameManager.startGame();
        gameManager.setGame(new BasketballGame());
        gameManager.startGame();
    }
}
