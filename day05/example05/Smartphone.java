package example05;

public class Smartphone extends Telephone{
	private String game;
	Smartphone(String owner, String game) {
		super(owner, game);
		this.game = game;
	}

	void playGame() {
		System.out.printf("%s이가 %s 게임을 하는 중이다.",owner,game);
	}
}
