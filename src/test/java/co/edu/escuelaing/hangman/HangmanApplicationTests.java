package co.edu.escuelaing.hangman;

import org.junit.jupiter.api.Test;
import co.edu.escuelaing.hangman.model.GameScore;
import co.edu.escuelaing.hangman.model.BonusScore;
import co.edu.escuelaing.hangman.model.OriginalScore;
import co.edu.escuelaing.hangman.model.PowerScore;

import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HangmanApplicationTests {

	private GameScore bonusScore = new BonusScore();

	@Test
	void testBonusScore_CorrectCount3_IncorrectCount1_Returns25() {
		bonusScore.setCorrectCount(3);
		bonusScore.setIncorrectCount(1);
		bonusScore.calculateScore();
		int score = bonusScore.getScore();
		assertEquals(25, score);
	}

	@Test
	void testBonusScore_CorrectCount0_IncorrectCount0_Returns0() {
		bonusScore.reset();
		bonusScore.setCorrectCount(0);
		bonusScore.setIncorrectCount(0);
		bonusScore.calculateScore();
		int score = bonusScore.getScore();
		assertEquals(0, score);
	}

	private GameScore originalScore = new OriginalScore();

	@Test
	void testOriginalScore_CorrectCount1_IncorrectCount3_Returns70() {
		originalScore.setCorrectCount(1);
		originalScore.setIncorrectCount(3);
		originalScore.calculateScore();
		int score = originalScore.getScore();
		assertEquals(70, score);
	}

	@Test
	void testOriginalScore_CorrectCount0_IncorrectCount0_Returns100() {
		originalScore.reset();
		originalScore.setCorrectCount(0);
		originalScore.setIncorrectCount(0);
		originalScore.calculateScore();
		int score = originalScore.getScore();
		assertEquals(100, score);
	}

	private GameScore powerScore = new PowerScore();

	@Test
	void testPowerScore_CorrectCount3_IncorrectCount1_Returns117() {
		powerScore.setCorrectCount(3);
		powerScore.setIncorrectCount(1);
		powerScore.calculateScore();
		int score = powerScore.getScore();
		assertEquals(117, score);
	}

	@Test
	void testPowerScore_CorrectCount6_IncorrectCount2_Returns500() {
		powerScore.reset();
		powerScore.setCorrectCount(6);
		powerScore.setIncorrectCount(2);
		powerScore.calculateScore();
		int score = powerScore.getScore();
		assertEquals(500, score);
	}

	@Test
	void testPowerScore_CorrectCount0_IncorrectCount0_Returns0() {
		powerScore.reset();
		powerScore.setCorrectCount(0);
		powerScore.setIncorrectCount(0);
		powerScore.calculateScore();
		int score = powerScore.getScore();
		assertEquals(0, score);
	}

}