
public class App {

	public static void main(String[] args) {
		Game footballGame = new Football();
		Game basketballGame = new Basketball();

		footballGame.startGame();
		basketballGame.startGame();
	}
}
