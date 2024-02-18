public class GameManager{

    GameBehavior game;

    public void setGame(GameBehavior game) {
		this.game = game;
	}
	
	public void startGame() {
		this.game.startGame();
	}

}
