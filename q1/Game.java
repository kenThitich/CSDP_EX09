
public abstract class Game {	
	protected abstract void initializeGame();
	protected abstract void playingGame();
	protected abstract void showResult();
	
	public final void startGame() {
		initializeGame();
		playingGame();
		showResult();
	}
}
