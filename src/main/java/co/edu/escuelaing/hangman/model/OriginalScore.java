package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("originalScore")
public class OriginalScore implements GameScore{
    private int puntaje;
    public OriginalScore(){
        this.puntaje=100;
    }

    public int calculateScore(int correctCount, int incorrectCount)throws modelException {
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        respuesta = puntaje - (incorrectCount*10);
        if (respuesta < 0){
            respuesta = 0;
        }
        return respuesta;
    }

}