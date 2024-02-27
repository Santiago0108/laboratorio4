package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("bonusScore")
public class BonusScore extends GameScore{
    public BonusScore(){
        incorrectCount = 0;
        correctCount = 0;
        gameScore=0;
    }

    @Override
    public void calculateScore() {
        gameScore = gameScore - (incorrectCount*5) + (correctCount*10);
        if (gameScore < 0){
            gameScore = 0;
        }
    }

    @Override
    public void reset() {
        gameScore = 0;
    }
}