package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("powerScore")
public class PowerScore implements GameScore{
    private int puntaje;
    public PowerScore(){
        this.puntaje=0;
    }

    public int calculateScore(int correctCount, int incorrectCount)throws modelException {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        for (int i = 0; i < correctCount; i++) {
            respuesta += Math.pow(5, i + 1);
        }
        respuesta -= incorrectCount * 8;
        if (respuesta < 0) {
            respuesta = 0;
        } else if (respuesta > 500) {
            respuesta = 500;
        }
        return respuesta;
    }
}