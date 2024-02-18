public class Basketball extends Game {

	@Override
	protected void initializeGame() {
		System.out.println("Initializing basketball game...");
	}

	@Override
	protected void playingGame() {
		System.out.println("Playing basketball game...");
	}

	@Override
	protected void showResult() {
		System.out.println("Showing the result for the basketball game...");
	}
}
