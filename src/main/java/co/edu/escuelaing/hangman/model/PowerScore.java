    package co.edu.escuelaing.hangman.model;

    import org.springframework.stereotype.Component;

    @Component("powerScore")
    public class PowerScore extends GameScore{
        private int puntaje;
        public PowerScore(){
            incorrectCount = 0;
            correctCount = 0;
            puntaje=0;
        }

        @Override
        public void calculateScore() {
            for (int i = 0; i < correctCount; i++) {
                gameScore = (int) Math.pow(5, i + 1);
            }
            gameScore -= incorrectCount * 8;
            if (gameScore < 0) {
                gameScore = 0;
            } else if (gameScore > 500) {
                gameScore = 500;
            }
        }

        @Override
        public void reset() {
            gameScore = 0;
        }
    }