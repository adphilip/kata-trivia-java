package trivia;

public interface IGame {

	boolean addPlayerName(String playerName);

	void roll(int roll);

	boolean wasCorrectlyAnswered();

	boolean wrongAnswer();

	void askQuestion();

}