package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("originalScore")
public class OriginalScore extends GameScore{
    private int puntaje;
    public OriginalScore(){
        incorrectCount = 0;
        correctCount = 0;
        gameScore=100;
    }

    @Override
    public void calculateScore() {
        gameScore = gameScore - (incorrectCount*10);
        if (gameScore < 0){
            gameScore = 0;
        }
    }

    @Override
    public void reset() {
        gameScore = 100;
    }
}