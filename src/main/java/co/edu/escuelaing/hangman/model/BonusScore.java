package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("bonusScore")
public class BonusScore implements GameScore{
    private int puntaje;
    public BonusScore(){
        this.puntaje=0;
    }

    public int calculateScore(int correctCount, int incorrectCount) throws modelException{
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        respuesta = puntaje - (incorrectCount*5) + (correctCount*10);
        if (respuesta < 0){
            respuesta = 0;
        }
        return respuesta;
    }
}