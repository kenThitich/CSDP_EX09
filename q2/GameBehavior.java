public abstract class GameBehavior {
    public abstract void initializeGame();
    public abstract void playingGame();
    public abstract void showResult();

    public final void startGame() {
		initializeGame();
		playingGame();
		showResult();
	}
}
